package com.sonata;

public class Truck extends Car {
	int weight;
	public Truck(int speed, double regularPrice, String colour,int weight){
		super(speed, regularPrice, colour);
		this.weight=weight;
	}
	public double getSalePrice(){
		double salePrice=super.getSalePrice();
		if(weight>2000) {
			return salePrice-salePrice*0.1;
		}
		return salePrice-salePrice*0.2;
	}
}
