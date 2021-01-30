package com.manoj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomePageController {
	
	@RequestMapping("/show")
	public String ShowHome() {
		return "showhome";
	}

}
