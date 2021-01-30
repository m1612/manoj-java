package com.manoj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
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
	
	
	

}
