package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.web.model.UserEntity;
import com.springboot.web.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistration(ModelMap model) {
		model.addAttribute("user", new UserEntity());
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") UserEntity user, ModelMap model) {
		if (!user.equals(null) && user.getUsername() != "" && user.getPassword() != "" && user.getFirstName() != ""
				&& user.getLastName() != "") {
			boolean userExist = service.createUser(user);
			if (userExist) {
				return "welcome2";
			}
			model.addAttribute("userExist", "User name not available!");
			return "register";
		}
		System.out.println("blank register");
		model.addAttribute("error", "Please fill up all the field");
		return "register";
	}
	
}
