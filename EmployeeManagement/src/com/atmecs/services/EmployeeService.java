package com.atmecs.services;

import java.util.List;

import com.atmecs.businesslogic.EmployeeFunctions;
import com.atmecs.pojo.AccountPOJO;
import com.atmecs.pojo.EmployeePOJO;
import com.atmecs.pojo.TransactionPOJO;


public class EmployeeService {
	
	EmployeeFunctions employeeFunctions = new EmployeeFunctions();
	
	public int passAddEmp(EmployeePOJO employeePOJO) throws Exception
	{
		return employeeFunctions.addEmp(employeePOJO);
	}
	
	public boolean passModifyEmp(int empId, String fName, String lName, String departmentName, String designationName) throws Exception 
	{
		return employeeFunctions.modifyEmp(empId, fName, lName, departmentName, designationName);
	}
	
	public boolean passRemoveEmp(int empId) throws Exception
	{
		return employeeFunctions.removeEmp(empId);
	}

	public EmployeePOJO passGetEmp(int empId) 
	{
		return employeeFunctions.getEmp(empId);
	}
	
	public List<EmployeePOJO> passGetAllEmps() 
	{
		return employeeFunctions.getAllEmps();
	}
	
	public AccountPOJO passViewAccountDetails(int empId) throws Exception
	{
		return employeeFunctions.viewAccountDetails(empId);
	}
	
	public int passTransferAmount(int sourceEmpId, int destinationEmpId, int transferAmount) throws Exception
	{
		return employeeFunctions.transferAmount(sourceEmpId, destinationEmpId, transferAmount);
	}
	
	public TransactionPOJO passSearchTransaction(int transactionId) {
		return employeeFunctions.searchTransaction(transactionId);
	}
	
}
