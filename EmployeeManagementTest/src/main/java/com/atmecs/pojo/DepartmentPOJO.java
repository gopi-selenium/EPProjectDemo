package com.atmecs.pojo;

public class DepartmentPOJO 
{

	private int id;
	private String departmentName;
	
	
	public DepartmentPOJO() {
		super();
		
		System.out.println("Insdie Department POJO Constructor.....s");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
