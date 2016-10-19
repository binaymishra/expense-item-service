package com.expense.item.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expense.item.service.manager.ItemManager;
import com.expense.item.service.model.ItemServiceResponse;

@Controller
public class ExpenseItemController {

  @Autowired
  @Qualifier("itemCacheManager")
  private ItemManager itemCacheManager;

  @RequestMapping("/expense/item")
  @ResponseBody
  ItemServiceResponse findAllItems(){
	ItemServiceResponse response = new ItemServiceResponse();
	response.setItemIdNameMap(itemCacheManager.findItemIdNames());
	return response;
  }

}
