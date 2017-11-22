package com.example.domain;

public class Receipt {

	private int id;
	private double price;
	private String nameClient;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNameClient() {
		return nameClient;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	
}
