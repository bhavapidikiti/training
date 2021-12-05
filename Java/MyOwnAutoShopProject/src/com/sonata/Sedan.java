package com.sonata;

public class Sedan extends Car {
	private int length;
	public Sedan(int speed, double regularPrice, String colour,int length) 
	{
		super(speed, regularPrice, colour);
		this.length=length;
	}
	public double getSalePrice() {
		double salePrice=super.getSalePrice();
		if(length>20) {
			return salePrice-salePrice*0.05;
		}
		return salePrice-salePrice*0.1;
	}
}
