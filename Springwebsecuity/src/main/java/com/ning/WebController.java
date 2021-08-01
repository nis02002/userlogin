package com.ning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
	
	@Autowired
	private MyUserService service; 
	
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}


	@RequestMapping("/login")
	public String loginPage( Model model)
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String showNewProductPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);	
		return "registration";
	}

}
