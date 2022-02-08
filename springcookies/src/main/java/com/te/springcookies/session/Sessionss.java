package com.te.springcookies.session;

import java.security.KeyStore.Entry.Attribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Sessionss {
	
	@GetMapping("login")
	public String log() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postlogin(String name, Model model, HttpServletRequest req,HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.setAttribute("data", name);
		model.addAttribute("name",name);
		return "welcome";
	}
	
	@GetMapping("/inbox")
	public String getlogin(Model model,HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		String attribute = (String)session.getAttribute("data");
		model.addAttribute("data",attribute);
		return "inbox";
	}

}
