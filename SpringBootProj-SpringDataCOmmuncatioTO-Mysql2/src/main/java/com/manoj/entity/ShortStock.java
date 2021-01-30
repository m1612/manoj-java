package com.manoj.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShortStock implements Serializable {

	@Id
	private int  cid;
	private String cshort;
	private String sbrand;
	private String location;
	
	
	public ShortStock(int cid, String cshort, String sbrand, String location) {
		super();
		this.cid = cid;
		this.cshort = cshort;
		this.sbrand = sbrand;
		this.location = location;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCshort() {
		return cshort;
	}
	public void setCshort(String cshort) {
		this.cshort = cshort;
	}
	public String getSbrand() {
		return sbrand;
	}
	public void setSbrand(String sbrand) {
		this.sbrand = sbrand;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "ShortStock [cid=" + cid + ", cshort=" + cshort + ", sbrand=" + sbrand + ", location=" + location + "]";
	}
	
	
	
	

}
