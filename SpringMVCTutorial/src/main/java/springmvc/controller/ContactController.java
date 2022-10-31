package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonInfo(Model mo)
	{
		mo.addAttribute("Header", "Welcome to Our Application");
		mo.addAttribute("desc","This is an registration form for our channel");
	}
	
	
	@RequestMapping("/contact")
	public String viewForm( Model m)
	{
		
		return "contact";
	}
	
	/* Request Param Annotation
	@RequestMapping(path="/registrationform", method=RequestMethod.POST)
	public String registrationForm(@RequestParam(name="email", required=true) String email,
			                       @RequestParam("username") String username,
			                       @RequestParam("password") String password, Model model)
	{
		
		User user=new User();
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		
		model.addAttribute("user", user);
			
		//model.addAttribute("email", email);
		//model.addAttribute("username", username);	
		//model.addAttribute("password",password);
		
		System.out.println("Email :"+email);
		System.out.println("Username: "+username);
		System.out.println("Password:"+password);
	return "success";
	}
	*/
	
	//ModelAttribute Annotation
	@RequestMapping(path="/registrationform", method=RequestMethod.POST)
	public String registrationForm(@ModelAttribute User user, Model model)
	{
		int id=this.userService.createUser(user);
		
		model.addAttribute("msg", "User Created with "+id);
		
		//model.addAttribute("user", user);
			
		//model.addAttribute("email", email);
		//model.addAttribute("username", username);	
		//model.addAttribute("password",password);
		
		System.out.println(user);
		
	return "success";
	}

}
