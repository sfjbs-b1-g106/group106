package com.example.demo.utility;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "pensioner")
public class Pensiondetailutility {
	@Id
	@Column(name = "aadhar")
	private long aadharNumber;
	@Column(name="allowances")
	private double allowances;
	@Column(name = "salary")
	private double salaryEarned;
	@Column(name =  "pension_type")
	private String pensionType;
	@Column(name = "banktype")
	private String bankType;
	
/*	private double pensionamount=9893;
	
	public double getPensionamount() {
		return pensionamount;
	}
	public void setPensionamount(double pensionamount) {
		this.pensionamount = pensionamount;
	}*/
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public double getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public Pensiondetailutility() {}
	public Pensiondetailutility(long aadharNumber, double allowances, double salaryEarned, String pensionType,
			String bankType) {
		super();
		this.aadharNumber = aadharNumber;
		this.allowances = allowances;
		this.salaryEarned = salaryEarned;
		this.pensionType = pensionType;
		this.bankType = bankType;
	
	
	}
	@Override
	public String toString() {
		return "Pensiondetailutility [aadharNumber=" + aadharNumber + ", allowances=" + allowances + ", salaryEarned="
				+ salaryEarned + ", pensionType=" + pensionType + ", bankType=" + bankType + ", pensionamount="
				;
	}
	
	
	
}
