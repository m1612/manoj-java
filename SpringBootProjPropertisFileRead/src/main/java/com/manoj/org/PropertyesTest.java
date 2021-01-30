package com.manoj.org;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("pro")
@ConfigurationProperties(prefix = "my.app")

public class PropertyesTest implements CommandLineRunner {

	
	private Integer myid;

	private String  myname;

	private String mywork;
	private String add;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}


	@Override
	public String toString() {
		return "PropertyesTest [myid=" + myid + ", myname=" + myname + ", mywork=" + mywork + ", add=" + add + "]";
	}


	public Integer getMyid() {
		return myid;
	}


	public void setMyid(Integer myid) {
		this.myid = myid;
	}


	public String getMyname() {
		return myname;
	}


	public void setMyname(String myname) {
		this.myname = myname;
	}


	public String getMywork() {
		return mywork;
	}


	public void setMywork(String mywork) {
		this.mywork = mywork;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}
	

}
