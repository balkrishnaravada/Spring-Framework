package com.springbootproject.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class TestClass {
	
	@RequestMapping("/test")
	public String firstHandler()
	{
		return"This is test class";
	}
			

}
