package com.revature.dndhelper.controllers;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HttpServletBean;
import com.revature.dndhelper.beans.CharacterStats;


public class CharacterStatsController{
	
	@RequestMapping(value = "/assignStats", method = RequestMethod.POST)
	public void assignStats(@PathVariable("charStats") CharacterStats charStats) {
		// if we need to use the controller to store the character stats it will be done here
		// otherwise we should not need this controller
	}
}