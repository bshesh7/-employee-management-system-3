package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="new_table")
public class Employee {
	
	@Id
	@Column(name = "Employee_Id")
	private long eId;
	
	@Column(name = "First_Name")
	private String eFname;
	
	@Column(name = "Last_Name")
	private String eLname;
	
	@Column(name = "Dob")
	private String dob;
	
	@Column(name = "SSN")
	private String ssn;

	public long geteId() {
		return eId;
	}

	public void seteId(long eId) {
		this.eId = eId;
	}

	public String geteFname() {
		return eFname;
	}

	public void seteFname(String eFname) {
		this.eFname = eFname;
	}

	public String geteLname() {
		return eLname;
	}

	public void seteLname(String eLname) {
		this.eLname = eLname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
}
