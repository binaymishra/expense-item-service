package com.expense.item.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseStatus(value = HttpStatus.OK)
	public void home() {	}

}
