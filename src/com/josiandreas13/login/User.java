package com.josiandreas13.login;

import javax.validation.constraints.Pattern;  
import com.josiandreas13.customvalidation.Password;  

public class User {
	
    @Pattern(regexp="^[a-zA-Z0-9]{6,}",message="length must be greater than 6")  
	private String name;  
    
    @Password  
    private String pass;  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getPass() {  
        return pass;  
    }  
    public void setPass(String pass) {  
        this.pass = pass;  
    }     
}
