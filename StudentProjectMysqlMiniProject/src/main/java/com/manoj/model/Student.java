package com.manoj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "Studenttable")
public class Student {
	
	@Id
	@GeneratedValue
	private Integer stdid;
	private String sName;
	private String sEmail;
	private long snumber;
	private String sGender;
	private String sCourse;
	
	private double sCourseFees;
	
	

	public Integer getStdid() {
		return stdid;
	}

	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}

	public long getSnumber() {
		return snumber;
	}

	public void setSnumber(long snumber) {
		this.snumber = snumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public double getsCourseFees() {
		return sCourseFees;
	}

	public void setsCourseFees(double sCourseFees) {
		this.sCourseFees = sCourseFees;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", sName=" + sName + ", sEmail=" + sEmail + ", snumber=" + snumber
				+ ", sGender=" + sGender + ", sCourse=" + sCourse + ", sCourseFees=" + sCourseFees + "]";
	}
	
	
	

}
