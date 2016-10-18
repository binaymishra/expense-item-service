package com.expense.item.service.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import com.expense.item.service.domain.Item;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
public class ItemServiceResponse implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	Map<Integer, String> itemIdNameMap;
	Collection<String> itemNames;
	Collection<Item> items;
	Item item;

	public ItemServiceResponse() {
		// TODO Auto-generated constructor stub
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Map<Integer, String> getItemIdNameMap() {
		return itemIdNameMap;
	}

	public void setItemIdNameMap(Map<Integer, String> itemIdNameMap) {
		this.itemIdNameMap = itemIdNameMap;
	}

	public Collection<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(Collection<String> itemNames) {
		this.itemNames = itemNames;
	}

	@Override
	public String toString() {
		return "ItemServiceResponse [itemIdNameMap=" + itemIdNameMap + ", itemNames=" + itemNames + ", items=" + items
		    + ", item=" + item + "]";
	}

}
