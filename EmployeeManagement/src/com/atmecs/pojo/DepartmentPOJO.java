package com.atmecs.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class DepartmentPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String departmentName;


	public DepartmentPOJO() {
		super();
		System.out.println("Insdie Department POJO Constructor.....s");
	}


	public DepartmentPOJO(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
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
