package com.manoj.service;

import java.util.List;
import java.util.Optional;

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
		if (cf = st.getsCourse().equals("core java")) {
			st.setsCourseFees(1256.02);

		}

		else if (cf = st.getsCourse().equals("ADV VAJA")) {
			st.setsCourseFees(1696.02);

		}

		else if (cf = st.getsCourse().equals("SPRING")) {
			st.setsCourseFees(1366.02);

		}

		else {
			st.setsCourseFees(1256.02);

		}
		st = repo.save(st);

		return st.getStdid();
	}

	@Override
	public List<Student> featchallStudentData() {

		List<Student> liststudent = repo.findAll();
		System.out.println(liststudent);
		return liststudent;
	}

	@Override
	public Student getOneEmployee(Integer stdid) {
		Optional<Student> opt = repo.findById(stdid);
		if (opt.isPresent()) {
			Student s = opt.get();
		}

		return null;
	}

	@Override
	public void deleteStudentById(Integer id) {
		repo.deleteById(id); 
	}
}
