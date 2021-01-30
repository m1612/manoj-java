package com.manoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.model.Student;
import com.manoj.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public Integer saveStudentData(Student st) {
		boolean cf;
		if(
		 cf=st.getSCourse().equals("core java"))
			 {st.setSCourseFees(1256.02);
				
			}
			
			 else if(cf=st.getSCourse().equals("ADV VAJA"))
			{st.setSCourseFees(1696.02);
				
			}
			
			 else if(cf=st.getSCourse().equals("SPRING"))
			{st.setSCourseFees(1366.02);
				
			}
			
			else
			{st.setSCourseFees(1256.02);
				
			}
		st=repo.save(st);
		
		return  st.getStdid() ;
	}
	
	@Override
	public List<Student> featchallStudentData() {
		
		return repo.findAll();
	}

}
