package com.example.demo.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


import com.example.demo.repository.PensionprocessRepository;
import com.example.demo.utility.Pensioncaloutput;
import com.example.demo.utility.Pensiondetailutility;
import com.tcs.entity.PensionDetail;
import com.tcs.entity.PensionerDetail;

@Repository
public class Service {
	 
	@Autowired
	PensionprocessRepository processrepo;
	
	Pensioncaloutput pensioncaloutput=null;
	
	public Optional<Iterable<Pensiondetailutility>> getPensionprocessdetails(Long aadharNumber) {
		
		return Optional.of(processrepo.findAll());
	}
	
	//Calling Other Pensiondetail Microserver
	@Autowired
	RestTemplate template;
	
	public List<Object> getPensionerAllDetail() {
		
     String urlOfAnotherMicroservice = "http://localhost:8085/AllPensioner";
		
		Object[] dataFromAnotherService = template.getForObject(urlOfAnotherMicroservice, Object[].class);
		
		return Arrays.asList(dataFromAnotherService);
	}

	//Pension calculation
	
	public Map<String, Object> calculateBankServiceCharge(PensionerDetail pensioner) {
		Map<String, Object> chargesMap = new HashMap<>();
		PensionDetail detail = new PensionDetail();
		Long calculatedAmount = 0L;
		Long bankCharges = 0L;

		bankCharges = (pensioner.getBankDetail().getIsPublic()) ? 500L : 550L;
		calculatedAmount = (pensioner.getPensionClassification().equals("F"))
				? Math.round(0.8 * Double.valueOf(pensioner.getSalaryEarned())) + Long.valueOf(pensioner.getAllowance())
				: Math.round(0.5 * Double.valueOf(pensioner.getSalaryEarned()))
						+ Long.valueOf(pensioner.getAllowance());
		detail.setBankCharges(bankCharges);
		detail.setPensionAmount(calculatedAmount);
		chargesMap.put("Pension Details for Aadhar: " + pensioner.getPan(), detail);
		return chargesMap;
	}
	
	
	/*

	public List<Pensioncaloutput> getpensioneramount(Long aadharNumber)
	{
		double pensionamout;
		if(processrepo.getPensionType()=="family")
		{			
		 pensionamout=(Double) (processrepo.getSalaryEarned()*0.5+processrepo.getAllowances());			
			
		}
		else {
		 pensionamout=(Double) (processrepo.getSalaryEarned()*0.8+processrepo.getAllowances());
				
		}
	
		pensioncaloutput=new Pensioncaloutput();
		pensioncaloutput.setPensionamount(pensionamout);
		pensioncaloutput.setAadharNumber(aadharNumber);
		pensioncaloutput.setBankservice(500);
		
	
	return Arrays.asList(pensioncaloutput) ;
	}

//	public Optional<Iterable<Pensiondetailutility>> getpensioneramount(Long aadharNumber) {
	//	return Optional.of(processrepo.findAll());
		
//	}
	*/
	
}
