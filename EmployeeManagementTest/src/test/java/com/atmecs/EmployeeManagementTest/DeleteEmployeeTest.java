package com.atmecs.EmployeeManagementTest;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.atmecs.pojo.EmployeePOJO;

import flex.messaging.io.amf.client.AMFConnection;
import flex.messaging.io.amf.client.exceptions.ClientStatusException;
import flex.messaging.io.amf.client.exceptions.ServerStatusException;

public class DeleteEmployeeTest 
{

	AMFConnection amfConnection = null;
	EmployeePOJO employeePOJO = null;

	public DeleteEmployeeTest()
	{
		try {
			amfConnection = Connection.getAMFConnection();
		} catch (ClientStatusException e) {
			e.printStackTrace();
		} 
	}

	@When("I Delete Employee Details of \"$empId\"")
	public void deleteEmployee(int empId) throws ClientStatusException, ServerStatusException
	{
		Object result = amfConnection.call("employeeServiceObject.passRemoveEmp",empId);

		System.out.println("Result is "+result);

	}

	@Then("Check Whether Employee Details of \"$empId\" is still present")
	public void checkDeleteEmployee(int empId) throws ClientStatusException, ServerStatusException
	{
		
		Object result = new Object();
		try {
			result = amfConnection.call("employeeServiceObject.passGetEmp", empId);
		} catch (ClientStatusException | ServerStatusException e) {
			
			amfConnection.call("employeeServiceObject.passViewAccountDetails", empId);
		}

		EmployeePOJO pojo = (EmployeePOJO)result;
		System.out.println("Result POJO"+pojo.toString());
		System.out.println("Inside Then result "+employeePOJO.equals(result));

	}
}
