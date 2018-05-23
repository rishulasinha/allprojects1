package com;

public class Vehicle {
	int no;
	String name;
	double price;
	public Vehicle(int no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}