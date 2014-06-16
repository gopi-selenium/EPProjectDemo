package com.atmecs.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atmecs.pojo.DesignationPOJO;
import com.atmecs.utils.HibernateUtils;

public class DesignationDAO {

	private static Session session;
	private static SessionFactory factory;
	private static Transaction transaction;

	//Constructor
	public DesignationDAO()
	{
		System.out.println("Inside DesignationDAO Constructor...");
		factory= HibernateUtils.getFactory();	
		insertDesignation();
	}

	//Inserting in Designation Table only once
	private void insertDesignation()
	{
		session=factory.openSession();
		Query query = session.createQuery("from DesignationPOJO");

		if(query.list().isEmpty())
		{
			factory= HibernateUtils.getFactory();
			transaction=session.beginTransaction();
			session.save(new DesignationPOJO(1,"MANAGER"));
			session.save(new DesignationPOJO(2,"TL"));
			session.save(new DesignationPOJO(3,"ENGINEER"));
			transaction.commit();
		}
	}

	//Searching Designation by Name
	public Object searchDesignation(String name) 
	{
		session=factory.openSession();
		String hql="from DesignationPOJO where designation=:Name";
		Query query= session.createQuery(hql);
		query.setParameter("Name", name);
		return query.uniqueResult();
	}

}
