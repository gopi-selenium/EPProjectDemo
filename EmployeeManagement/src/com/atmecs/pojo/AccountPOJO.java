package com.atmecs.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@OneToOne(targetEntity=com.atmecs.pojo.EmployeePOJO.class, cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	private EmployeePOJO empId;

	@Column
	private int amount;

	public AccountPOJO() {
		super();
		System.out.println("Inside AccountPOJO Consrtuctor........");
	}

	public EmployeePOJO getEmpId() {
		return empId;
	}

	public void setEmpId(EmployeePOJO empId) {
		this.empId = empId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}



}
