package com.black.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	@RequestMapping(method=RequestMethod.GET,value ="/")
	public ModelAndView inicio() {
		ModelAndView mv = new ModelAndView("produto/prod");
		return mv;
		
	}
	
	
	
}
