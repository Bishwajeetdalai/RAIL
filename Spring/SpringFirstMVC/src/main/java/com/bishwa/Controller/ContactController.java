package com.bishwa.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bishwa.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user,Model model) 
			
	{	
		System.out.println(user);
			if(user.getUserName().isBlank()) {
			
			return "redirect:/contact" ;
		}
		
		//process
//		model.addAttribute("user", user);
		
		return "success";
	}
}
		


//@RequestMapping(path="/processform",method=RequestMethod.POST)
//public String handleForm(@RequestParam("email") String userEmail,
//		@RequestParam("userName") String userName,
//		@RequestParam("password") String userPassword, Model model)
//{
//	User user=new User();		
//	user.setEmail(userEmail);
//	user.setUserName(userName);
//	user.setPassword(userPassword);
//	
//	System.out.println(user);
//	
//	model.addAttribute("user", user);
//	return "success";
//}
	
//	System.out.println("user email is " + userEmail);
//	System.out.println("user name is " + userName);
//	System.out.println("user password is " + userPassword);
	
	//process
	
//	model.addAttribute("name", userEmail);
//	model.addAttribute("email", userName);
//	model.addAttribute("password", userPassword);
	