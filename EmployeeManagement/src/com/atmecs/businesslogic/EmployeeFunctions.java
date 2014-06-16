package com.atmecs.businesslogic;

import java.util.List;

import com.atmecs.dao.AccountDAO;
import com.atmecs.dao.EmployeeDAO;
import com.atmecs.dao.TransactionDAO;
import com.atmecs.pojo.AccountPOJO;
import com.atmecs.pojo.EmployeePOJO;
import com.atmecs.pojo.TransactionPOJO;


public class EmployeeFunctions 
{
	EmployeeDAO employeeDAO = new EmployeeDAO();
	AccountDAO accountDAO = new AccountDAO();
	TransactionDAO transactionDAO = new TransactionDAO();

	public int addEmp(EmployeePOJO employeePOJO) throws Exception
	{
		return employeeDAO.insertEmp(employeePOJO);
	}

	public boolean modifyEmp(int empId, String fName, String lName, String departmentName, String designationName) throws Exception
	{
		return employeeDAO.updateEmp(empId, fName, lName, departmentName, designationName);
	}

	public boolean removeEmp(int empId) throws Exception 
	{
		return employeeDAO.deleteEmp(empId);
	}

	public EmployeePOJO getEmp(int empId) 
	{
		return employeeDAO.searchEmp(empId); 
	}

	public List<EmployeePOJO> getAllEmps() 
	{
		return employeeDAO.showAllEmp();
	}

	public AccountPOJO viewAccountDetails(int empId) throws Exception
	{
		return accountDAO.showAccountInfo(empId);
	}


	//Transaction Method
	public int transferAmount(int sourceEmpId, int destinationEmpId, int transferAmount) throws Exception 
	{
		int transactionID;
		if(employeeDAO.searchEmp(sourceEmpId) != null && employeeDAO.searchEmp(destinationEmpId) != null)
		{
			AccountPOJO accountPOJO = new AccountPOJO();
			accountPOJO = accountDAO.showAccountInfo(sourceEmpId);
			int currentAmount = accountPOJO.getAmount();

			if(transferAmount > 0)
			{
				if( currentAmount >= transferAmount)
				{
					currentAmount = currentAmount - transferAmount;
					accountDAO.updateAccountInfo(sourceEmpId, currentAmount);

					accountPOJO = accountDAO.showAccountInfo(destinationEmpId);
					accountDAO.updateAccountInfo(destinationEmpId, accountPOJO.getAmount()+transferAmount);

					transactionID = transactionDAO.insertTransaction(sourceEmpId, destinationEmpId, transferAmount);
				}
				else
				{
					throw new Exception("Insufficient Balance for this Transaction");
				}
			}
			else
			{
				throw new Exception("Invalid Transfer Amount");
			}
		}
		else
		{
			throw new Exception("Employee Id does not Exist");
		}
		return transactionID;
	}


	//Searching Transactions by Transaction ID
	public TransactionPOJO searchTransaction(int transactionId) {
		return transactionDAO.searchTransaction(transactionId);
	}

}
