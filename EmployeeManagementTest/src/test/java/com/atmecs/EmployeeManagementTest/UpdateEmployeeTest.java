package com.atmecs.EmployeeManagementTest;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.atmecs.pojo.EmployeePOJO;

import flex.messaging.io.amf.client.AMFConnection;
import flex.messaging.io.amf.client.exceptions.ClientStatusException;
import flex.messaging.io.amf.client.exceptions.ServerStatusException;

public class UpdateEmployeeTest
{
	EmployeePOJO employeePOJO = null;
	AMFConnection amfConnection = null;
	
	public UpdateEmployeeTest() {
		super();
		try {
			amfConnection = Connection.getAMFConnection();
		} catch (ClientStatusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I Update Employee Details as \"$empId\" \"$fName\" \"$lName\" \"$departmentName\" \"$designationName\"")
	public void updateEmployee(int empId, String fName,String lName, String departmentName,String designationName) throws ClientStatusException, ServerStatusException
	{
		Object result = amfConnection.call("employeeServiceObject.passModifyEmp", empId , fName , lName , departmentName , designationName );

		System.out.println("Result is "+result);
	}

	@Then("Check Whether Employee Details are Updated as \"$empId\" \"$fName\" \"$lName\" \"$departmentName\" \"$designationName\"")
	public void checkUpdateEmployee(int empId, String fName,String lName, String departmentName,String designationName) throws ClientStatusException, ServerStatusException
	{
		employeePOJO = Helper.getEmployeePOJO(fName, lName, departmentName, designationName);

		Object result = amfConnection.call("employeeServiceObject.passGetEmp", empId);

		EmployeePOJO pojo = (EmployeePOJO)result;
		System.out.println("Result POJO"+pojo.toString());
		
		System.out.println("Inside Then result "+employeePOJO.equals(result));

	}
}
