package com.springboot.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.model.UserEntity;
import com.springboot.web.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String processLogin(ModelMap model, @ModelAttribute("user") UserEntity user) {
		if (user != null && user.getUsername() != "" && user.getPassword() != "") {
			if(service.validateUser(user)) {
				model.addAttribute("name", user.getUsername());
				return "welcome";
			}
		}
		model.addAttribute("error", "Invalid Credentials!");
		return "login";
	}

}
