package com.expense.item.service.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.expense.item.service.DataLoader;

@Service("itemCacheManager")
public class ItemCacheManager implements ItemManager{

  @Autowired
  private DataLoader dataLoader;

  @Override
  @Cacheable("default")
  public Map<Integer, String> findItemIdNames(){
	List<String> items = dataLoader.loadItems();
	Map<Integer, String> map = new HashMap<>(items.size());
	for(String item: items){
	  String[] split = StringUtils.split(item, "|");
	  map.put(Integer.parseInt(StringUtils.trim(split[0])), StringUtils.trim(split[1]));
	}
	return map;
  }

}
