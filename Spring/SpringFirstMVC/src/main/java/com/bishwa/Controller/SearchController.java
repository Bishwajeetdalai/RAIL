package com.bishwa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String search() {
		System.out.println("welcome to  search Box");
		return "search";
	}
	@RequestMapping("/searchbar")
	public RedirectView view(@RequestParam("data")String data) {
		 
		RedirectView view1=new RedirectView();
		view1.setUrl("http://www.google.com/search?q="+ data);
		
		return view1;
		
	
	}
	
}
