package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.model.Register;
import com.te.springmvc.service.MvcService;

@Controller
public class MvcController {

	@RequestMapping("/spider")
	public String home() {
		return "home";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}

// @RequestMapping(path="/loginpage",method=RequestMethod.POST)
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	
//	public String log(HttpServletRequest req) {
	public String log(@RequestParam("user")String username,@RequestParam("pass")String password) {
//		String username = req.getParameter("user");
//		String password = req.getParameter("pass");
		if (username.isEmpty()) {
			return "failure";
		}
		return "success.jsp";
	}
	
//	@GetMapping("/register")
//	public String reg() {
//		return "register";
//	}
//	
//	@PostMapping("/register")
//	public String register(@ModelAttribute Register reg) {
//		System.out.println(reg.getName()+" "+reg.getEmail()+" "+reg.getAddress()+" "+reg.getPhoneNo());
//		return "failure";
//	}
	
	@GetMapping("/register")
	public String reg() {
		return "register";
	}
	
	@Autowired
	MvcService service;
	
	@PostMapping("/register")
	public String register(Register reg, ModelMap map) {
		map.addAttribute("details",reg);
		service.save(reg);
		return "success";
	}

}
