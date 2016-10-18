package com.expense.item.service.model;

import java.io.Serializable;
import java.util.Collection;

import com.expense.item.service.domain.Item;


public class ItemServiceRequest implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	Collection<Item> items;
	Item item;

	public ItemServiceRequest() {
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

	@Override
	public String toString() {
		return "ItemServiceRequest [items=" + items + ", item=" + item + "]";
	}

}
