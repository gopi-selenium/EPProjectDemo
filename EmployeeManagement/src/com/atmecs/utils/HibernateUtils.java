package com.atmecs.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

public class HibernateUtils {
	private static SessionFactory factory;
	static {
		// create empty hib config inst --def constr & configure it.
		Configuration cfg = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		factory = cfg.buildSessionFactory(reg);
		System.out.println("INside Static BLOCk OF SessionFActory....");
	}
	public static SessionFactory getFactory() {
		return factory;
	}
	public static Session getSession()
	{
		return factory.openSession();
	}
	
}
