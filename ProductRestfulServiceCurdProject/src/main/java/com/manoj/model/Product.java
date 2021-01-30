package com.manoj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "producttable")
public class Product {
	
	@Id
	@GeneratedValue
	private Integer prodId;
	
	private String prodCode;
	private double prodCost;
	
	private double prodgst;
	private double prodDisc;

}
