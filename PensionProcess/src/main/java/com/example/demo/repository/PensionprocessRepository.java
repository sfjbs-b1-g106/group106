package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.utility.Pensiondetailutility;
import com.tcs.entity.PensionerDetail;

@Repository
public interface PensionprocessRepository extends JpaRepository<Pensiondetailutility, Long> {

	String  getPensionType();

	

	double getSalaryEarned();

	double getAllowances();

	
}
