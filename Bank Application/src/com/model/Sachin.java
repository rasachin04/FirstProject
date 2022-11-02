package com.model;

import java.util.stream.LongStream;

import com.serviceImple.HDFC;

public class Sachin {
	private long AccountNO;
	private String AccountHolderName;
	private String Address;
	private long AdharNo;
	private long MobNo;
	private String Panno;
	private double depositAmount;
	private double WithdrawlAmount;
	private double viewBalance;
	
	public double getViewBalance() {
		return viewBalance;
	}
	public void setViewBalance(double viewBalance) {
		this.viewBalance = viewBalance;
	}
	
	public long getAccountNO() {
		return AccountNO;
	}
	public void setAccountNO(long longStream) {
		AccountNO = longStream;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getAdharNo() {
		return AdharNo;
	}
	public void setAdharNo(long adharNo) {
		AdharNo = adharNo;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}
	public String getPanno() {
		return Panno;
	}
	public void setPanno(String panno) {
		Panno = panno;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawlAmount() {
		return WithdrawlAmount;
	}
	public void setWithdrawlAmount(double withdrawlAmount) {
		WithdrawlAmount = withdrawlAmount;
	}
		}
