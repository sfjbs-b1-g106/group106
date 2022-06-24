package com.example.demo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
@Table(name = "pensioner")
public class Pensiondetails {
	
	@Id
	@Column(name = "aadhar")
	private long aadharNumber;
	@Column(name = "full_name")
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DOB")
	private LocalDate dateOfBirth;
	@Column(name="pan")
	private String pan;
	@Column(name = "salary")
	private double salaryEarned;
	@Column(name="allowances")
	private double allowances;
	@Column(name =  "pension_type")
	private String pensionType;
	@Column(name = "bank")
	private String bankName;
	@Column(name = "accnumber")
	private String accountNumber;
	@Column(name = "banktype")
	private String bankType;
	
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Pensiondetails(long aadharNumber, String name, LocalDate dateOfBirth, String pan, double salaryEarned,
			double allowances, String pensionType, String bankName, String accountNumber, String bankType) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}
	public Pensiondetails() {}
	
	
   
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	
}
