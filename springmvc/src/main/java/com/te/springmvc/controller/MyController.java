package com.te.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.model.Register;
import com.te.springmvc.service.MvcService;


public class MyController {
	
	@GetMapping("/test")
	public String test(Model model) {
		String s="shashi";
		model.addAttribute("name",s);
		return "test";
	}
	
	@GetMapping("/test2")
	public String test2(ModelMap map) {
		String s="kattappa";
		map.addAttribute("mama",s);
		return "test";
	}
    
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mav) {
		String s="Broke Leasner";
		mav.addObject("name",s);
		mav.setViewName("test");
		return mav;
	}
	
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
