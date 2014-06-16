package com.atmecs.EmployeeManagementTest;

import flex.messaging.io.amf.client.AMFConnection;
import flex.messaging.io.amf.client.exceptions.ClientStatusException;

public class Connection 
{

private static AMFConnection amfConnection = null;

	
	private Connection() throws ClientStatusException {
		super();
		amfConnection = new AMFConnection();
		amfConnection.connect("http://localhost:8080/EmployeeManagement/messagebroker/amf");
	}


	public static AMFConnection getAMFConnection() throws ClientStatusException
	{
		if(amfConnection == null)
			new Connection();
		return amfConnection;
	}
}
