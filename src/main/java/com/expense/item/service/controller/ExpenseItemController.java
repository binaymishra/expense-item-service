package com.expense.item.service.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expense.item.service.DataLoader;
import com.expense.item.service.model.ItemServiceResponse;

@Controller
public class ExpenseItemController {
	
	@Autowired
	private DataLoader dataLoader;
	
	@RequestMapping("/expense/item")
	@ResponseBody
	ItemServiceResponse findAllItems(){
		ItemServiceResponse response = new ItemServiceResponse();
		response.setItemIdNameMap(prepareItemMap(dataLoader.loadItems()));
		return response;
	}
	
	private Map<Integer, String> prepareItemMap(List<String> items){
		Map<Integer, String> map = new HashMap<>(items.size());
		for(String item: items){
			String[] split = StringUtils.split(item, "|");
			map.put(Integer.parseInt(StringUtils.trim(split[0])), StringUtils.trim(split[1]));
		}
		return map;
	}

}
