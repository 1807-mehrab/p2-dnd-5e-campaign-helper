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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HttpServletBean;
import com.revature.dndhelper.beans.DNDCharacter;

// Might not even need this controller if we handle the data input in ember
@Controller
@RequestMapping("/classes")
public class ClassController{
	@RequestMapping(value = "/selectClass/{Class}")
	public void selectClass(@PathVariable("Class") String charClass) {
		if(charClass != null) {
			// if we need to store the class input from ember in here
		}
		else System.out.println("failure to pass Class from webpage");
	}
}