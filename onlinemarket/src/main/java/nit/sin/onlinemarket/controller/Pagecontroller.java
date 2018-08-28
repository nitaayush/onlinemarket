package nit.sin.onlinemarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nit.sin.marketbackend.dao.CategoryDao;
import nit.sin.marketbackend.dto.Category;

@Controller
public class Pagecontroller {
	
	@Autowired
	private CategoryDao categoryDAO;
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
		
		@RequestMapping(value= {"/contact"})
		public ModelAndView contact() {
			ModelAndView mv= new ModelAndView("page");
			mv.addObject("title", "Contact Us");
			mv.addObject("userClickContact", true);
			return mv;
		}

}

