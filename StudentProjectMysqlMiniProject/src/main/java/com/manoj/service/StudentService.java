package com.manoj.service;

import java.util.List;

import com.manoj.model.Student;

public interface StudentService {
	
	public Integer saveStudentData(Student st); 
	
	public List<Student> featchallStudentData();

	public void deleteStudentById(Integer id);
	
	public Student getOneEmployee(Integer stdid);
}
