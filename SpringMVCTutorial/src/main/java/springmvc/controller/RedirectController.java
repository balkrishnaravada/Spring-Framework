package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	
	@RequestMapping("/first")
	public String firstUrl()
	{
		System.out.println("This is first Url");
		return "second";
	}
	
	@RequestMapping("/second")
	public String secondUrl()
	{
		System.out.println("This is Second Url");
		return "";
		
	}

}
