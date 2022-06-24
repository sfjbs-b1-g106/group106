package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PensionerDetailService {
	
	@Autowired
	PensionerRepository repo;

	List<Pensiondetails> getPensionerAllDetail() {
		return (List<Pensiondetails>) repo.findAll();
	}

	public Optional<Pensiondetails> getPensionerDetailByAadharCard(Long aadharNumber) {
		return repo.findById(aadharNumber);
	}

	public void addNewPensioner(Pensiondetails pensioner) {
		
			repo.save(pensioner);
   }
		
	}


