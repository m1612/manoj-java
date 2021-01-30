package com.manoj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manoj.model.StudentModel;

@Controller
public class StudentController {
	
	
	@RequestMapping("/register")
	public String showHomwPage() {
		
		return	"home";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	
	public String fromSubmitPage(
	  
		@ModelAttribute StudentModel studentModel,Model model
			) 
		{
		System.out.println(studentModel);
		model.addAttribute("std",studentModel);
		return "submit" ;
	}

}
