package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	  @RequestMapping("/greet")
	  @ResponseBody
	  @CrossOrigin(origins = "http://localhost:3000")
     public String home() {
    	 return "Hello";
	}
}
