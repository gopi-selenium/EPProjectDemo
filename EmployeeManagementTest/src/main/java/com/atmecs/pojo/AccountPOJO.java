package com.atmecs.pojo;

public class AccountPOJO 
{
	private int id;

	private EmployeePOJO empId;

	private int amount;


	public AccountPOJO() {
		super();
		System.out.println("Inside AccountPOJO Consrtuctor........");
	}

	public EmployeePOJO getEmpId() {
		return empId;
	}

	public void setEmpId(EmployeePOJO empId) {
		this.empId = empId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AccountPOJO [id=" + id + ", empId=" + empId + ", amount="
				+ amount + "]";
	}

}
