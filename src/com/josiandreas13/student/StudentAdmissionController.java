package com.josiandreas13.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student,
			ModelMap model) {
		model.addAttribute("name", student.getStudentName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		model.addAttribute("studentHobby", student.getStudentHobby());

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
