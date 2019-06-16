package com.zkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zkoss.zkspringmvc.annotation.ZKSelector;

@SpringBootApplication
@Controller
public class ZkdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkdemoApplication.class, args);
	}
	
	@GetMapping("/login")
    public String login() {
        return "login";
    }
	
	 @GetMapping("/secure/{page}")
	    public String secure(@PathVariable String page) {
	        return "secure/" + page;
	   }
	

}
