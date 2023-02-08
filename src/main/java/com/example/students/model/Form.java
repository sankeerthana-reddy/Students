package com.example.students.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forms")
public class Form {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "subject")
	private  String subject;
	
	@Column(name = "grade")
	private String garde;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "form_code")
	private String formCode;
	
	@Column(name = "created_time")
	private Timestamp  createdTime;
		
	@Column(name = "last_updated_time")
	private Timestamp lastUpdatedTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGarde() {
		return garde;
	}

	public void setGarde(String garde) {
		this.garde = garde;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	
}
