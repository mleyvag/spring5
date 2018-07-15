package com.miguel.pe.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${application.controller.message}")
	private String message;

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("message", "hello spring boot");
		return "hello";
	}
	
	
}
