package com.manoj.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

@Entity
public class MyHouse {

	@Id
	@Column(name = "hid")
	private int houseid;
	@Column(name = "hname")
	private String housename;
	@Column(name = "hadd")
	private String houseadd;

	@ElementCollection
	@CollectionTable(name = "hnames", joinColumns = @JoinColumn(name = "hid"))
	@OrderColumn(name = "fname")
	@Column(name = "hindex")
	private List<String> houseMemberName;

	@CollectionTable(name = "hmembers", joinColumns = @JoinColumn(name = "hid"))
	@Column(name = "hrooms")
	@ElementCollection
	private Set<Integer> housemember;

	@ElementCollection
	@CollectionTable(name = "hlocation", joinColumns = @JoinColumn(name="hid"))
	@Column(name = "hindex")
	@OrderColumn(name = "hareanum")
	private Map<Integer, String> houselocation;
	
	

	public MyHouse() {
		super();
	}

	
	@Override
	public String toString() {
		return "MyHouse [houseid=" + houseid + ", housename=" + housename + ", houseadd=" + houseadd
				+ ", houseMemberName=" + houseMemberName + ", housemember=" + housemember + ", houselocation="
				+ houselocation + "]";
	}

	
	

	public int getHouseid() {
		return houseid;
	}

	public void setHouseid(int houseid) {
		this.houseid = houseid;
	}

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getHouseadd() {
		return houseadd;
	}

	public void setHouseadd(String houseadd) {
		this.houseadd = houseadd;
	}

	public List<String> getHouseMemberName() {
		return houseMemberName;
	}

	public void setHouseMemberName(List<String> houseMemberName) {
		this.houseMemberName = houseMemberName;
	}

	public Set<Integer> getHousemember() {
		return housemember;
	}

	public void setHousemember(Set<Integer> housemember) {
		this.housemember = housemember;
	}

	public Map<Integer, String> getHouselocation() {
		return houselocation;
	}

	public void setHouselocation(Map<Integer, String> houselocation) {
		this.houselocation = houselocation;
	}
}
