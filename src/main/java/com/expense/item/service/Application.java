package com.expense.item.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "' expense-item-service ' is up and running, requested URL [/] and response HTTP 200 OK.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
