package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="shopping")
@Entity
public class Shopping {
	@Id
	private int quantity;
	private String product;
	private int price;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Shopping(int quantity, String product, int price) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}
	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}

}