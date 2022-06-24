package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Service;
import com.example.demo.utility.Pensioncaloutput;
import com.example.demo.utility.Pensiondetailutility;
import com.tcs.entity.PensionerDetail;


@RestController
public class Processcontroller {
    
	@Autowired
	Service service;
	
	//Calling the Pensiondetails Microserver
	@GetMapping("/Allpensioners")
	public List<Object> getPensionerAllDetail() {
		
		return service.getPensionerAllDetail();
	
	}
	//Selfcallingmethod
	@GetMapping("/selfcall")
public Optional<Optional<Iterable<Pensiondetailutility>>> getPensionprocessdetails(Long aadharNumber) {
		
		return Optional.of(service.getPensionprocessdetails(aadharNumber));
	}
	
	@GetMapping("/PensionerProcessByAadhaar/{aadharNumber}") 
	public Optional<Iterable<Pensiondetailutility>> getPensionerDetailByAadhar(@PathVariable Long aadharNumber) {
		
		return service.getPensionprocessdetails(aadharNumber);
		
	}
	
	/*----------------------------------------------*/
	@PostMapping(value = "/ProcessPension/{id}")
	public ResponseEntity<Object> getPensionerDetailByPAN(@PathVariable String id) {
		System.out.println(id);
		PensionerDetail pensioner = service.fetchPensionerDetailsByPAN(id);
		if(pensioner == null) {
			return new ResponseEntity<Object>("Invalid pensioner detail provided, please provide valid detail.",HttpStatus.UNAUTHORIZED);
		}
		
		
		return new ResponseEntity<Object>(service.calculateBankServiceCharge(pensioner),HttpStatus.ACCEPTED);
	}
	
}
