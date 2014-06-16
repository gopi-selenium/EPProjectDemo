package com.atmecs.EmployeeManagementTest;

import com.atmecs.pojo.EmployeePOJO;

public class Helper 
{
	public static EmployeePOJO getEmployeePOJO(String fName,String lName, String departmentName,String designationName) 
	{
		EmployeePOJO employeePOJO = new EmployeePOJO();
		employeePOJO.setfName(fName);
		employeePOJO.setlName(lName);
		employeePOJO.setDepartmentName(departmentName);
		employeePOJO.setDesignationName(designationName);
		
		return employeePOJO;
		
	}
}
