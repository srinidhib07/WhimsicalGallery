package com.klu.gallery.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@GetMapping("/alogin")
	public ModelAndView alogin()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("alogin");
		return mv;
	}
	@RequestMapping("/adminsucc")
	public ModelAndView adminsucc()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("adminsucc");
		return mv;
	}

}
