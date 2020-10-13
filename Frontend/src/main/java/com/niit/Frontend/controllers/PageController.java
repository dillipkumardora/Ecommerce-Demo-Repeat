package com.niit.Frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index()
	{
	 ModelAndView mv=new ModelAndView("page");
	mv.addObject("demo","Hello dillip");
	return mv;
			
	}
	
	@RequestMapping(value= {"/test/{id}"})
	public ModelAndView test(@PathVariable(value="id")String id) {
	 ModelAndView mv=new  ModelAndView("page");
	 mv.addObject("demo",id);
	return mv;
		
	}
}
