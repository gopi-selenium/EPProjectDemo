package com.atmecs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atmecs.pojo.EmployeePOJO;
import com.atmecs.utils.HibernateUtils;
import com.atmecs.dao.DepartmentDAO;

public class EmployeeDAO {

	private Session session;
	private SessionFactory factory;
	private Transaction transaction;
	private AccountDAO acoountDAO;

	//Constructor
	public EmployeeDAO()
	{
		System.out.println("Inside EmployeeDAO Constructor...");
		factory= HibernateUtils.getFactory();		
	}

	//Insert data in Employee table....
	public int insertEmp(EmployeePOJO employeePOJO) throws Exception
	{

		if(checkForNULLValuesPresent(employeePOJO))
			throw new Exception("Employee has Null Values");
		else if(checkForDepartment(employeePOJO))
			throw new Exception("NO Such Departments..");
		else if(checkForDesignation(employeePOJO))
			throw new Exception("NO Such Designation..");
		else
		{
			session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(employeePOJO);
			transaction.commit();
			acoountDAO= new AccountDAO();
			acoountDAO.insert(employeePOJO);
			return employeePOJO.getEmpId();

		}

	}



	//update the employee generic method
	public boolean updateEmp(int empId,String fName, String lName,String departmentName,String designationName) throws Exception
	{
		boolean returnValue=false;

		EmployeePOJO employeePOJO = new EmployeePOJO();
		employeePOJO.setEmpId(empId);
		employeePOJO.setfName(fName);
		employeePOJO.setlName(lName);
		employeePOJO.setDepartmentName(departmentName);
		employeePOJO.setDesignationName(designationName);
		
		if(empId==0 || checkForNULLValuesPresent(employeePOJO))
			throw new Exception("Update values has Null ,update failed...");
		else if(null==searchEmp(empId))
			throw new Exception("No Such Employeee,update failed...");
		else
		{
			String hql;
			session=factory.openSession();
			transaction=session.beginTransaction();

			hql="update Employee set firstName=:fname,lastName=:lname,departmentName=:departmentName,designationName=:designationName where empId=:empId";
			Query query=session.createSQLQuery(hql);	
			query.setParameter("empId", empId);
			query.setParameter("lname", lName);
			query.setParameter("fname", fName);
			query.setParameter("departmentName", departmentName);
			query.setParameter("designationName", designationName);
			query.executeUpdate();
			System.out.println("Employee updated successfully....");
			transaction.commit();
			returnValue=true;
		}

		return returnValue;

	}


	//delete employee with his account details	
	public boolean deleteEmp(int empId) throws Exception
	{
		boolean returnValue=false;

		if(empId==0)
			throw new Exception("Employee has 0 Values,....");
		else if(searchEmp(empId)==null)
			throw new Exception("No Such Employee ,....");
		else
		{
			EmployeePOJO employeePOJO = new EmployeePOJO();
			employeePOJO.setEmpId(empId);
			String hql;
			session=factory.openSession();
			transaction=session.beginTransaction();

			hql="delete from  AccountPOJO where empId=:empId";

			Query query= session.createQuery(hql);
			query.setParameter("empId", employeePOJO);
			query.executeUpdate();		

			hql="delete from  EmployeePOJO where empId=:empId";

			query= session.createQuery(hql);
			query.setParameter("empId", empId);
			query.executeUpdate();		
			System.out.println("Employee Deleted successfully....");
			transaction.commit();
			returnValue=true;
		}

		return returnValue;
	}


	//Search Employee by id
	public EmployeePOJO searchEmp(int id)
	{
		String hql;
		session=factory.openSession();

		hql="from  EmployeePOJO where empId=:id";

		Query query=session.createQuery(hql);
		query.setParameter("id", id);
		System.out.println("Insdie Seacrh Function...");
		EmployeePOJO returnobj= (EmployeePOJO) query.uniqueResult();
		return returnobj;

	}


	//Show All Employees
	public List<EmployeePOJO> showAllEmp()
	{
		session=factory.openSession();
		String hql="from EmployeePOJO ";
		Query query=session.createQuery(hql);
		System.out.println("Insdie Seacrh Function...");
		List<EmployeePOJO> returnobj = query.list();
		return returnobj;

	}


	//Method for checking Null Values	
	private boolean checkForNULLValuesPresent(EmployeePOJO employeePOJO) 
	{
		if(employeePOJO.getDepartmentName()==null || employeePOJO.getDepartmentName()=="")
		{
			System.out.println("Employee Department found null");
			return true;
		}
		else if(employeePOJO.getDesignationName()==null || employeePOJO.getDesignationName()=="")
		{
			System.out.println("Employee Deaprtment Name  found NULL");
			return true;
		}
		else if(employeePOJO.getlName()==null || employeePOJO.getlName()=="")
		{
			System.out.println("Employee Last found NULL");
			return true;
		}
		else if(employeePOJO.getfName()==null || employeePOJO.getfName()=="")	
		{
			System.out.println("Employee First Name found NULL");
			return true;
		}
		else
			return false;
	}


	//Employee's Department
	private boolean checkForDepartment(EmployeePOJO employeePOJO)
	{
		DepartmentDAO departmentDAO = new DepartmentDAO();
		if(departmentDAO.searchDepartmentByName(employeePOJO.getDepartmentName())==null) 		
			return true;
		else
			return false;
	}

	
	//Employee's Designation
	private boolean checkForDesignation(EmployeePOJO employeePOJO) 
	{
		DesignationDAO designationDAO = new DesignationDAO();
		if(designationDAO.searchDesignation(employeePOJO.getDesignationName())==null)
			return true;
		else
			return false;	
	}

}
