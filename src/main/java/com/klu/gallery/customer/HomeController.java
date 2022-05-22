package com.klu.gallery.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@GetMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("/register")
	public ModelAndView register()
	{
		return new ModelAndView("register", "user", new User());
	}
	@PostMapping("/signup")
	public ModelAndView signup(@ModelAttribute("user") User user)
	{
		userService.addUserRecord(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		mv.addObject("name", user.getFname());
		return mv;
	}

	@RequestMapping("/customer")
	public ModelAndView customer()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("customer");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/success")
	public String success(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		if(userService.findByUsernameAndPassword(username, password)!=null)
		{
			User user= userService.findByUsernameAndPassword(username,password);
			return "customer";
		}
		return "errorpage";
			
	}
//	@RequestMapping("/success")
//	public ModelAndView success()
//		{
//			ModelAndView mv= new ModelAndView();
//			mv.setViewName("success");
//			return mv;
//		}
	@RequestMapping("/errorpage")
	public ModelAndView errorpage()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("errorpage");
		return mv;
	}
	@RequestMapping("/authenticator")
	public ModelAndView authenticator()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("authenticator");
		return mv;
	}
	
	
	
	@GetMapping("/showall")
	public ModelAndView showall()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("showall");
		return mv;
	}
	@RequestMapping("/search")
		public ModelAndView search()
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("search");
			return mv;
		}
	@GetMapping("/cost1")
	public ModelAndView cost1()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("cost1");
		return mv;
		
	}
	@GetMapping("/knowmore1")
	public ModelAndView knowmore1()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("knowmore1");
		return mv;
		
	}
	@RequestMapping("/historic")
	public ModelAndView historic()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("historic");
		return mv;
	}
	@RequestMapping("/acrylic")
	public ModelAndView acrylic()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("acrylic");
		return mv;
	}
	@RequestMapping("/oilpainting")
	public ModelAndView oilpainting()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("oilpainting");
		return mv;
	}
	@RequestMapping("/potrait")
	public ModelAndView potrait()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("potrait");
		return mv;
	}
	@RequestMapping("/landscape")
	public ModelAndView landscape()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("landscape");
		return mv;
	}
	@RequestMapping("/davinci")
	public ModelAndView davinci()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("davinci");
		return mv;
	}
	@RequestMapping("/watercolor")
	public ModelAndView watercolor()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("watercolor");
		return mv;
	}
	@RequestMapping("/verner")
	public ModelAndView verner()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("verner");
		return mv;
	}
	@RequestMapping("/vangogh")
	public ModelAndView vangogh()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("vangogh");
		return mv;
	}
	@RequestMapping("/schedapp")
	public ModelAndView schedapp()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("schedapp");
		return mv;
	}
	@RequestMapping("/certificate")
	public ModelAndView certificate()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("certificate");
		return mv;
	}
	@RequestMapping("/certificate1")
	public ModelAndView certificate1()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("certificate1");
		return mv;
	}
	@RequestMapping("/knowmore2")
	public ModelAndView knowmore2()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("knowmore2");
		return mv;
	}
	@RequestMapping("/addpainting")
	public ModelAndView addpainting()
	{
		return new ModelAndView("addpainting", "painting", new Painting());
		
	}
	@RequestMapping("/painting")
	public ModelAndView painting()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("painting");
		return mv;
		
	}
}
