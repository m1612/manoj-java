package com.manoj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.manoj.dto.EmoployeeDto;

public class EmployeeDao {
	
	private final static String SELECT_ALL_EMPLOYEE="SELECT * FROM EMPLOYEE_SAL ";
	private final static String  SELECT_UPDATE_EMPLOYEE ="";
	
	@Autowired
	private JdbcTemplate jt;
	
	public  String saveEmployee() {
		
		return null;
	}

	public List<EmoployeeDto> allDataEmployees(){
		List<EmoployeeDto> listdto=	jt.query(SELECT_ALL_EMPLOYEE, BeanPropertyRowMapper.newInstance(EmoployeeDto .class));
		
	return listdto ;
	}
	
	public int upadteEmployee() {
		
		return 1;
	}
	public void deleteEmployee() {
		
	}
	
	
	
}
