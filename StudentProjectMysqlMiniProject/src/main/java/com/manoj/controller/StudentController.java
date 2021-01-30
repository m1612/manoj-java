package com.manoj.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manoj.model.Student;
import com.manoj.service.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl service;

	@RequestMapping("/regist")
	public String showpage() {

		return "Studentdata";
	}

	@PostMapping("/studentvalue")
	public String studentInsertData(@ModelAttribute Student student, Model model) {
		Integer id = service.saveStudentData(student);
		String massage = "Student data '" + id + "'is saved";
		model.addAttribute("msg", massage);
		return "Studentdata";
	}

	@GetMapping("/allStudent")
	public String allStudentData(Model model) {
		List<Student> listdata = service.featchallStudentData();
		model.addAttribute("list", listdata);
		return "studentalldata";
	}

	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer stdid,

			Model model) {
		Student stu = service.getOneEmployee(stdid);

		model.addAttribute("studentedit", stu);
		return "StudentEditPage";

	}
	@GetMapping("/delete")
	public String removeStudentId(
			@RequestParam Integer stdid
			,Model model) {
		service.deleteStudentById(stdid);
		model.addAttribute("msg","STUDENT"+stdid+"DELETE SUSSES");
		List<Student> listdata = service.featchallStudentData();
		model.addAttribute("list", listdata);
		return "studentalldata";
		}
	
	
}