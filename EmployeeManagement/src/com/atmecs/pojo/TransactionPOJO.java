package com.atmecs.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class TransactionPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;

	//one to one
	@Column
	private int sourceEmpId;

	//one to one
	@Column
	private int destiEmpId;

	@Column
	private int amount;
	
	@Column
	private Timestamp timestamp;


	public TransactionPOJO() {
		super();
		System.out.println("Inside transcation POJO.........");
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getSourceEmpId() {
		return sourceEmpId;
	}

	public void setSourceEmpId(int sourceEmpId) {
		this.sourceEmpId = sourceEmpId;
	}

	public int getDestiEmpId() {
		return destiEmpId;
	}

	public void setDestiEmpId(int destiEmpId) {
		this.destiEmpId = destiEmpId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	
}
