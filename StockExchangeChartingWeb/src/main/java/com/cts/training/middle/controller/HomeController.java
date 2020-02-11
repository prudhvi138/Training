package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.UserDAO;
import com.cts.training.model.Company;
import com.cts.training.model.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private CompanyDAO companyDAO;
	
	//@GetMapping("/") -->In spring 4.3 version and Above
	@RequestMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC");
		return "index";
		
	}
	@RequestMapping("/user")
	public String userPage(Model model) {
		List<User> users = userDAO.getAllUsers();
		model.addAttribute("list",users);
		return "user";
		
	}
	@RequestMapping("/company")
	public String companyPage(Model model) {
		List<Company> company = companyDAO.getAllCompany();
		model.addAttribute("list",company);
		return "company";
		
	}

	private void addNames(List<String> names) {
		names.add("prudhvi");
		names.add("raj");
		names.add("mahesh");
		names.add("venkat");
		names.add("rahim");
		}

}
