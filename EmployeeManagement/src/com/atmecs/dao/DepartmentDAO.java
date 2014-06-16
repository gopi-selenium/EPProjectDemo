package com.atmecs.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atmecs.pojo.DepartmentPOJO;
import com.atmecs.utils.HibernateUtils;

public class DepartmentDAO {
	private static Session session;
	private static SessionFactory factory;
	private static Transaction transaction;

	//Constructor
	public DepartmentDAO()
	{
		System.out.println("Inside DepartmentDAO Constructor...");
		factory= HibernateUtils.getFactory();
		insertDepartment();
	}

	//Insertion in Department Table only once
	private void insertDepartment()
	{
		System.out.println("inside insert Department");
		session=factory.openSession();
		Query query = session.createQuery("from DepartmentPOJO");
	
		if(query.list().isEmpty())
		{
			System.out.println("inside if");
			factory= HibernateUtils.getFactory();
			session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(new DepartmentPOJO(1,"QA"));
			session.save(new DepartmentPOJO(2,"MOBILE"));
			session.save(new DepartmentPOJO(3,"DEVELOPMENT"));
			transaction.commit();
		}
	}

	
	//Searching Departments by Name
	public Object searchDepartmentByName(String name) throws NullPointerException
	{
		session=factory.openSession();		
		String hql="from DepartmentPOJO where departmentName=:Name";
		Query query= session.createQuery(hql);
		query.setParameter("Name", name);
		return query.uniqueResult();
	}


}
