package com.manojdao;

import org.springframework.stereotype.Component;

@Component
public class TestDao {


	String emp;
	
	public String SaveEmployee() {
		emp = "Employee save your data bace";
		
		return emp ;
	}
	
	// public.com.manojdao.TestDao.SaveEmployee()
}




