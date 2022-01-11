package com.te.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.te.crud.model.*;
import com.te.crud.service.CrudService;
@Controller
public class CrudController {
	@Autowired
	private CrudService service;
	
	@GetMapping
	public String add() {
		return "insert";
	}
	
	@PostMapping("/add")
	public String addEmp(Employee emp) {
//		case1:emp object is null
//		case2:emp object is not null and no exception
//		case3:emp object is not null and with exception
		boolean add=service.add(emp);  //case1:value add is false  case2:true   case3:false
		if(add) {
			return "success";
		}else {
			return "failure";
		}
	}

}
