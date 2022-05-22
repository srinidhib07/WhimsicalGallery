package com.klu.gallery.authenticator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klu.gallery.customer.User;

@Controller
public class AuthController {
	@Autowired
	AuthenticatorService authService;
	
	@GetMapping("/aregister")
	public ModelAndView aregister()
	{
		return new ModelAndView("aregister", "auth", new Authenticator());
	}
	@PostMapping("/authenticator")
	public ModelAndView succ(@ModelAttribute("auth") Authenticator auth)
	{
		authService.addUserRecord(auth);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("authenticator");
		mv.addObject("name", auth.getFname());
		return mv;
	}
	

}
