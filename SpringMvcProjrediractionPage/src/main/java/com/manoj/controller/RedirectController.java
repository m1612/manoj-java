package com.manoj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	
	@RequestMapping("/request")
	public String showRedirect() {
		
		return "redirect:method" ;
	}
	@GetMapping("method")
	public String ShowMethod() {
		
		return "show";
	}
}
