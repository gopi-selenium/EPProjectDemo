package com.atmecs.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
public class EmployeePOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empId")
	private int empId;

	@Column(name="firstName")
	private String fName;

	@Column(name="lastName")
	private String lName;

	@Column
	private String departmentName;

	@Column	
	private  String designationName;

	public EmployeePOJO() {
		super();
		System.out.println("Inside  Employee POJO Constructor.......");
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}




	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	@Override
	public String toString() {
		return "EmployeePOJO [empId=" + empId + ", fName=" + fName + ", lName="
				+ lName + ", departmentName=" + departmentName
				+ ", designationName=" + designationName + "]";
	}







}
