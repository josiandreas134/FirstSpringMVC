package com.josiandreas13.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping("/welcome/{CountryName}/{username}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars ) {
		
		String user = pathVars.get("username");
		String country = pathVars.get("CountryName");
		
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello "+user+"You are from: " + country);
		
		return model;
	}
	

}


