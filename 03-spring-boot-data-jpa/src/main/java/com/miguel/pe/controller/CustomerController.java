package com.miguel.pe.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miguel.pe.models.dao.ICustomerDao;
import com.miguel.pe.models.entity.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	private ICustomerDao customerDao;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("title", "List of Customers");
		model.addAttribute("customers", customerDao.findAll());
		return "list";
	}
	
	@RequestMapping(value = "/form")
	public String form(Map<String, Object> model) {
		Customer customer = new Customer();
		model.put("customer", customer);
		model.put("title", "Form of Customer");
		return "form";
	}
	
	@RequestMapping(value = "/form", method=RequestMethod.POST)
	public String save(Customer customer) {
		customerDao.save(customer);
		return "redirect:list";
	}
}
