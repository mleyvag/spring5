package com.miguel.pe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${application.controller.title}")
	private String value;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", this.value);
		return "index";
	}
	
}
