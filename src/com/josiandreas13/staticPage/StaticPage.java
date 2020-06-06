package com.josiandreas13.staticPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPage {
   @RequestMapping(value = "/static", method = RequestMethod.GET)
   public String stati() {
      return "static";
   }
   
   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
   public String redirect() {
      return "redirect:/pages/final.htm";
   }
   
   @RequestMapping(value = "/staticPage2", method = RequestMethod.GET)
   public String redirect2() {
      return "redirect:/pages/final2.htm";
   }
}