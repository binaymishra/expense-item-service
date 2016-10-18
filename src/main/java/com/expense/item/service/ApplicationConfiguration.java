package com.expense.item.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.expense.item.service.controller"})
public class ApplicationConfiguration {
	
	@Bean(initMethod="loadItems")
	public DataLoader loadQuoteData(){
		DataLoader dataLoader = new DataLoader();
		dataLoader.setFilePath("classpath:items.data");
		return dataLoader;
	}

}
