package com.qa.ims.persistence.domain;

public class Item {
	private Long id;
	private String itemName;
	private double value;
	
	
	public Item(String itemName, double value) {
		this.setItemName(itemName);
		this.setValue(value);
	}
	
	public Item(String itemName, double value, Long id) {
		this.setItemName(itemName);
		this.setValue(value);
		this.setId(id);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
		
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Item id=" + id + ", itemName=" + itemName + ", value=" + value;
	}
	
	

}
