package com.bishwa.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String demo() {
		System.out.println("this is java class ");
		return "home";
	}
//	@RequestMapping("/show")
//	public String view(Model model) {
//		System.out.println("this is view page");
//		model.addAttribute("name", "ashish");
//		List<String>frd=new ArrayList<>();
//		frd.add("deepak");
//		frd.add("dhruv");
//		frd.add("ankit");
//		model.addAttribute("list", frd);
//		return "home";
//		
//	}
}

