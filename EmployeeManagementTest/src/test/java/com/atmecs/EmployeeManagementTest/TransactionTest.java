package com.atmecs.EmployeeManagementTest;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.testng.Assert;

import com.atmecs.pojo.AccountPOJO;
import com.atmecs.pojo.TransactionPOJO;

import flex.messaging.io.amf.client.AMFConnection;
import flex.messaging.io.amf.client.exceptions.ClientStatusException;
import flex.messaging.io.amf.client.exceptions.ServerStatusException;

public class TransactionTest 
{

	AMFConnection amfConnection = null;
	AccountPOJO sourceAccountPOJO, destinationAccountPOJO = null;
	double transactionId;

	public TransactionTest()
	{
		try {
			amfConnection = Connection.getAMFConnection();
		} catch (ClientStatusException e) {
			e.printStackTrace();
		} 
	}

	@Given("Account details of Employees \"$sourceEmpId\" \"$destinationEmpId\"")
	public void checkAccountInfo( int sourceEmpId,  int destinationEmpId) throws ClientStatusException, ServerStatusException {
		Object result = amfConnection.call("employeeServiceObject.passViewAccountDetails", sourceEmpId);
		sourceAccountPOJO = (AccountPOJO)result;
		System.out.println("Account Info : "+sourceAccountPOJO);

		result = amfConnection.call("employeeServiceObject.passViewAccountDetails", destinationEmpId);
		destinationAccountPOJO = (AccountPOJO)result;
		System.out.println("Account Info : "+destinationAccountPOJO);
	}

	@When("I Enter Transaction Details as \"$sourceEmpId\" \"$destinationEmpId\" \"$transferAmount\"")
	public void transaction(int sourceEmpId, int destinationEmpId, int transferAmount) throws ClientStatusException, ServerStatusException
	{
		Object result = amfConnection.call("employeeServiceObject.passTransferAmount",sourceEmpId,destinationEmpId,transferAmount);
		transactionId = (double)result;
		System.out.println("Result is "+result);
	}

	@Then("Check Whether Transaction Details as \"$sourceEmpId\" \"$destinationEmpId\" \"$transferAmount\" are present")
	public void checkTransaction(int sourceEmpId, int destinationEmpId, int transferAmount) throws ClientStatusException, ServerStatusException {
		Object source = amfConnection.call("employeeServiceObject.passViewAccountDetails", sourceEmpId);
		AccountPOJO sourcePOJO = (AccountPOJO)source;
		Assert.assertEquals(sourcePOJO.getAmount(), sourceAccountPOJO.getAmount()-transferAmount);

		Object destination = amfConnection.call("employeeServiceObject.passViewAccountDetails", destinationEmpId);
		AccountPOJO destinationPOJO = (AccountPOJO)destination;
		Assert.assertEquals(destinationPOJO.getAmount(), destinationAccountPOJO.getAmount()+transferAmount);

		Object transaction = amfConnection.call("employeeServiceObject.passSearchTransaction", transactionId);
		System.out.println("Transaction Entry : "+((TransactionPOJO)transaction).toString());
		
	}
}
