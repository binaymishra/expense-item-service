package com.expense.item.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	@ResponseStatus(value = HttpStatus.OK)
	public void home() {
		System.out.println("' expense-item-service ' is up and running, requested URL [/] and response HTTP 200 OK.");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
