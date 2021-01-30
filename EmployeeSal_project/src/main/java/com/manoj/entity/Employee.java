package com.manoj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id
	private int empid;
	private String empName;
	private String empAdd;
	private long empNumber;
	private String Gender;

}
