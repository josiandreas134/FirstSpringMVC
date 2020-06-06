package com.josiandreas13.student;

import org.springframework.stereotype.Controller;
import javax.validation.Valid;  
import org.springframework.validation.BindingResult;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.josiandreas13.login.User;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Controller
public class StudentAdmissionController {
	
	/*
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}*/

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student(Model m) {
        m.addAttribute("student", new Student());  
		return "student";
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent( @Valid @ModelAttribute("student") Student student, BindingResult br,
			ModelMap model) {
		 if(student.getStudentName().length() < 5 ){
	         throw new SpringException("Given name is too short");
	      } else {
	         model.addAttribute("name", student.getStudentName());
	      }
	      
	      if( br.hasErrors() ){
	         throw new SpringException("Requires age between 18 to 45");
	      } else {
	         model.addAttribute("age", student.getAge());
	      }
	      if(student.getStudentMobile() < 10000000) {
	    	  throw new SpringException("Enter valid HK number");
	      }	else {
	    	      model.addAttribute("studentMobile", student.getStudentMobile());
	      }
	      model.addAttribute("id", student.getId());
	      model.addAttribute("studentHobby", student.getStudentHobby());
	      model.addAttribute("studentDOB", student.getStudentDOB());
	      model.addAttribute("studentSkills", student.getStudentSkills());

	      return "result";
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		
		model.addAttribute("headerMessage","Josia College of Engineering,Indonesia");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {
		
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		return model;
	}
	

}
