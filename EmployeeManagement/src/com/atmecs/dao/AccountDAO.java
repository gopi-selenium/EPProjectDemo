package com.atmecs.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atmecs.pojo.AccountPOJO;
import com.atmecs.pojo.EmployeePOJO;

import com.atmecs.utils.HibernateUtils;

public class AccountDAO {

	private Session session;
	private SessionFactory factory;
	private Transaction transaction;
	private EmployeeDAO employeeDAO;
	
	//Constructor
	public AccountDAO()
	{
		System.out.println("Inside AcoountDAO Constructor...");
		factory= HibernateUtils.getFactory();	
		employeeDAO= new EmployeeDAO();
	}
	
	
	//Insertion in Account Table during Employee Registration
	public boolean insert(EmployeePOJO employeePOJO) throws Exception 
	{
		boolean returnValue=false;
		if(employeeDAO.searchEmp(employeePOJO.getEmpId())==null)
		throw new Exception("No Such Source Employee Account");
		else
		{
		AccountPOJO accountPOJO= new AccountPOJO();
		accountPOJO.setAmount(50000);
		accountPOJO.setEmpId(employeePOJO);
		session =factory.openSession();
		transaction= session.beginTransaction();
		session.save(accountPOJO);
		returnValue=true;
		transaction.commit();
		
		}
		return returnValue;
	}
	

	//Account Information by Employee Id
	public AccountPOJO showAccountInfo(int empId) throws Exception 
	{ 
		if(searchAccountByempId(empId)==null)
			throw new Exception("No Such Enmployee..");
		return searchAccountByempId(empId);
	}

	
	//Search Account by Employee Id
	private AccountPOJO searchAccountByempId(int empId) throws Exception 
	{
		EmployeePOJO empPOJO = employeeDAO.searchEmp(empId);
		
		session =factory.openSession();
		String hql="from AccountPOJO where empId=:empID";
		org.hibernate.Query query= session.createQuery(hql);
		query.setParameter("empID",empPOJO);
		AccountPOJO accountPOJO = (AccountPOJO)query.uniqueResult();
		return accountPOJO;
	}
	
	
	//Update Account Information i.e. Amount and Employee Id
	public boolean updateAccountInfo(int empId,int amount) throws Exception
	{
		EmployeePOJO empPOJO = employeeDAO.searchEmp(empId);
		
		boolean returnvalue=false;
		
		if(null==searchAccountByempId(empId))
			throw new Exception("No Such Enmployee..");
		else if(amount==0||amount<0)
			throw new Exception("Invalid Amount..");
		else
		{
			session =factory.openSession();
			transaction=session.beginTransaction();
			String hql="update AccountPOJO set amount=:amount where empId=:empId";
			Query query= session.createQuery(hql);
			query.setParameter("amount", amount);
			query.setParameter("empId",empPOJO);
			query.executeUpdate();
			returnvalue=true;
			transaction.commit();
		}
		return returnvalue; 
	}
	
}
