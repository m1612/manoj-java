package com.manoj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manoj.model.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	//@Autowired
	//private StudentServiceImpl service;

	@RequestMapping("/regist")
	public String showpage(Model model) {
 
		model.addAttribute("stu",new Student());
		return "Studentdata";
	}

}
