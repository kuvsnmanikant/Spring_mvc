package com.springmvc.q8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	public ModelAndView getValues(){
		
		ModelAndView mv =new ModelAndView("login");
		return mv;
	}
}