package nit.sin.onlinemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Pagecontroller {
	
	@RequestMapping(value= "/")
	public ModelAndView index() {
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("greeting", "Welcome To Spring Web");
		mv.setViewName("page");
		return mv;
	}

}
