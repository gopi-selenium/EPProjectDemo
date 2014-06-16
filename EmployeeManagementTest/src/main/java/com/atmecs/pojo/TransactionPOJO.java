package com.atmecs.pojo;

public class TransactionPOJO 
{
private String Id;
	
	private EmployeePOJO sourceEmpId;

	private EmployeePOJO destiEmpId;
	
	private int amount;

	
	
	public TransactionPOJO() {
		super();
		System.out.println("Inside transcation POJO.........");
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public EmployeePOJO getSourceEmpId() {
		return sourceEmpId;
	}

	public void setSourceEmpId(EmployeePOJO sourceEmpId) {
		this.sourceEmpId = sourceEmpId;
	}

	public EmployeePOJO getDestiEmpId() {
		return destiEmpId;
	}

	public void setDestiEmpId(EmployeePOJO destiEmpId) {
		this.destiEmpId = destiEmpId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TransactionPOJO [Id=" + Id + ", sourceEmpId=" + sourceEmpId
				+ ", destiEmpId=" + destiEmpId + ", amount=" + amount + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		TransactionPOJO transactionPOJO = (TransactionPOJO)obj;
		
		System.out.println(transactionPOJO.toString());
		
		if(this.sourceEmpId == transactionPOJO.getSourceEmpId() && this.destiEmpId == transactionPOJO.getDestiEmpId() && this.amount == transactionPOJO.getAmount())
			return true;
		
		return false;
	}
}
