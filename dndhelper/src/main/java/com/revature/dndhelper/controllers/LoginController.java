package com.revature.dndhelper.controllers;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HttpServletBean;
import com.revature.dndhelper.beans.User;
import com.revature.dndhelper.service.UserService;
@Controller
@RequestMapping("/login")
public class LoginController{
	
	@RequestMapping(value = "/selectClass", method = RequestMethod.GET)
	@ResponseBody
	public void validateUser(@RequestParam("email") String email,
				@RequestParam("password") String password) {
		UserService service = new UserService();
		User user = service.getUserByEmail(email);
		if(user.getEmail().equals(email) && 
				user.getPassword().equals(password)) {
			//Go to character creation page
		}
		else {
			//Display error message on page: Requires connection to Ember
		}
	}
}