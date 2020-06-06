package com.josiandreas13.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;  
import javax.validation.Valid;  

@Controller
public class loginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String display(Model m) {
        m.addAttribute("user", new User());  
		return "login";
	}
	
	@RequestMapping("/hello")  
    public String submitForm( @Valid @ModelAttribute("user") User e, BindingResult br, Model m)  
    {  
        if(br.hasErrors() || !e.getPass().contains("admin"))  
        {  
			String msg = "Sorry " + e.getName() + ". You entered an incorrect password";
			m.addAttribute("message", msg);
            return "login";  
        }  
        else  
        {  
		String msg = "Hello " + e.getName();
		m.addAttribute("message", msg);
        return "index";  
        }  
    }  
	/*@RequestMapping("/hello")
	public String valid(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m) {
		if (pass.equals("admin")) {
			String msg = "Hello " + name;
			// add a message to the model
			m.addAttribute("message", msg);
			return "index";
		} else {
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "falsepass";
		}
	}*/

}