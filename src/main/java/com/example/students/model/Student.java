package com.example.students.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@Column(name = "firstname")
	private String  firstName;
		
	@Column(name = "lastname")
	private String lastName;
		
	@Column(name = "dob")
	private Date dob;
		
	@Column(name = "status")
	private String  status;
		
	@Column(name = "org_id")
	private int orgId;
		
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
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public Date getDob() {
			return dob;
		}
		
		public void setDob(Date dob) {
			this.dob = dob;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}
		
		public int getOrgId() {
			return orgId;
		}
		
		public void setOrgId(int orgId) {
			this.orgId = orgId;
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