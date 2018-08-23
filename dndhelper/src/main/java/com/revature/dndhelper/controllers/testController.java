package com.revature.dndhelper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dndhelper.beans.User;
import com.revature.dndhelper.service.UserService;

@CrossOrigin
@RestController
public class testController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public ResponseEntity<User> getUser() {
		User user = us.getUserByEmail("blazer");
		return ResponseEntity.ok(user);
	}
}
