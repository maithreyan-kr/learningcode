package com.user.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAccount 
{


	@Id
	private String empId;
	@Column
	  private String accountId;
	@Column
	  private String branch;
	
	
	public UserAccount() {
	
	}
	public UserAccount(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}



}
