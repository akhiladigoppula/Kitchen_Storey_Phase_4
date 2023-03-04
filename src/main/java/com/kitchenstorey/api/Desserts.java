package com.kitchenstorey.api;

import javax.validation.constraints.NotBlank;

public class Desserts extends FoodItem{
	private int id;
	@NotBlank(message = "Please enter Burger Name")
	private String name;
	@NotBlank(message = "Please enter Burger Description")
	private String desc;
	private int price;
	@NotBlank(message = "Please enter Burger Image Address")
	private String image;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
