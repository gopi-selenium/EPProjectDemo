package com.atmecs.pojo;

public class DesignationPOJO
{
	private int id;
	private String  designation;
	
	
	public DesignationPOJO() {
		super();
		
		System.out.println("Inside Designation POJO Constrructor....");
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
