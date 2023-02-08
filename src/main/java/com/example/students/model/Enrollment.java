package com.example.students.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enrollments")
public class Enrollment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "form_id")
	private int formId;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "status")
	private String status;
	
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
