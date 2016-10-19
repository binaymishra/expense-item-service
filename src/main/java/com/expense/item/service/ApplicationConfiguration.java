package com.expense.item.service;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@ComponentScan(basePackages = {"com.expense.item.service.controller", "com.expense.item.service.manager"})
public class ApplicationConfiguration {

  @Bean(initMethod="loadItems")
  public DataLoader loadQuoteData(){
	DataLoader dataLoader = new DataLoader();
	dataLoader.setFilePath("classpath:items.data");
	return dataLoader;
  }

  @Bean
  public CacheManager cacheManager() {
	SimpleCacheManager cacheManager = new SimpleCacheManager();
	cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("default")));
	return cacheManager;
  }

}
