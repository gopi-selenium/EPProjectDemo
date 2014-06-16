package com.atmecs.EmployeeManagementTest;


import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.atmecs.pojo.EmployeePOJO;

import flex.messaging.io.amf.client.AMFConnection;
import flex.messaging.io.amf.client.exceptions.ClientStatusException;
import flex.messaging.io.amf.client.exceptions.ServerStatusException;

public class AddEmployeeTest {

	AMFConnection amfConnection = null;
	EmployeePOJO employeePOJO = null;
	double empID;

	public AddEmployeeTest()
	{
		try {
			amfConnection = Connection.getAMFConnection();
		} catch (ClientStatusException e) {
			e.printStackTrace();
		} 
	}
	
	@When("I Enter Employee Details as \"$fName\" \"$lName\" \"$departmentName\" \"$designationName\"")
	public void addEmployee(String fName,String lName, String departmentName,String designationName) throws ClientStatusException, ServerStatusException
	{
		employeePOJO = Helper.getEmployeePOJO(fName, lName, departmentName, designationName);

		Object result = amfConnection.call("employeeServiceObject.passAddEmp",employeePOJO);

		empID = (double)result;
		
		System.out.println("Result is "+empID);

	}

	@Then("Check Whether Employee Details Entered as \"$fName\" \"$lName\" \"$departmentName\" \"$designationName\"")
	public void checkAddEmployee(String fName,String lName, String departmentName,String designationName) throws ClientStatusException, ServerStatusException
	{
		employeePOJO = Helper.getEmployeePOJO(fName, lName, departmentName, designationName);

		Object result = amfConnection.call("employeeServiceObject.passGetEmp", empID);

		EmployeePOJO pojo = (EmployeePOJO)result;
		
		System.out.println("Result POJO"+pojo.toString());
		System.out.println("Inside Then result "+employeePOJO.equals(result));

	}
}
