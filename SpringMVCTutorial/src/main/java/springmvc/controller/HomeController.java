package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "Rahul");
		
		List<String> students=new ArrayList<String>();
		students.add("Asif Khan");
		students.add("Akshay Yadav");
		students.add("Sameer Somaiya");
		
		model.addAttribute("student",students);
		
		
		System.out.println("This is index page");
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", "Suraj Yadav");
		mv.setViewName("about");
		System.out.println("This is About page");
		return mv;
	}

}
