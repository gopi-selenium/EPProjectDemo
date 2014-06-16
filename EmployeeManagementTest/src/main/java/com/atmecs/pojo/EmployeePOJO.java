package com.atmecs.pojo;

public class EmployeePOJO 
{
	private int empId;

	private String fName;

	private String lName;

	private String departmentName;

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

	@Override
	public boolean equals(Object object)
	{
		EmployeePOJO employeePOJO = (EmployeePOJO)object;

		System.out.println(employeePOJO.toString());
		if(this.fName.equals(employeePOJO.fName) && this.lName.equals(employeePOJO.lName) && this.departmentName.equals(employeePOJO.departmentName) && this.designationName.equals(employeePOJO.designationName) )
			return true;
		return false;
	}
}
