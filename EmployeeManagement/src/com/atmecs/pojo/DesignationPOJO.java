package com.atmecs.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Designation")
public class DesignationPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String  designation;


	public DesignationPOJO() {
		super();
		System.out.println("Inside Designation POJO Constrructor....");
	}


	public DesignationPOJO(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
