package com.atmecs.dao;

import java.sql.Timestamp;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atmecs.pojo.TransactionPOJO;
import com.atmecs.utils.HibernateUtils;

public class TransactionDAO {
	private Session session;
	private SessionFactory factory;
	private Transaction transaction;
	private EmployeeDAO employeeDAO;
	private AccountDAO accountDAO;

	//Constructor
	public TransactionDAO()
	{
		System.out.println("Inside TransactionDAO Constructor...");
		factory= HibernateUtils.getFactory();
		employeeDAO= new EmployeeDAO();
		accountDAO= new AccountDAO();
	}

	//Insertion in Transaction Table with all validations
	public int insertTransaction(int sourceEmpId,int destEmpId,int trasferamount) throws Exception
	{
		TransactionPOJO transactionPOJO= new TransactionPOJO();
		if(employeeDAO.searchEmp(sourceEmpId)==null)
			throw new Exception("No Such SOurce Employee Account");
		else if(employeeDAO.searchEmp(destEmpId)==null)
			throw new Exception("No Such Destination Employee Account");
		else if(trasferamount <= 0)
			throw new Exception("invalid trasfer Amount...");
		else
		{

			//TransactionPOJO transactionPOJO= new TransactionPOJO();
			transactionPOJO.setAmount(trasferamount);
			transactionPOJO.setDestiEmpId(destEmpId);
			transactionPOJO.setSourceEmpId(sourceEmpId);
			transactionPOJO.setTimestamp(new Timestamp(System.currentTimeMillis()));
			session=factory.openSession();
			transaction =session.beginTransaction();
			session.save(transactionPOJO);
			transaction.commit();
		}

		return transactionPOJO.getId();
	}
	
	//Searching in Transaction Table by source and destination empId
	public TransactionPOJO searchTransaction(int transactionId)
	{
		session=factory.openSession();
		Query query = session.createQuery("from TransactionPOJO where Id=:ID");
		query.setParameter("ID", transactionId);
	
		return (TransactionPOJO)query.uniqueResult();
	}
}
