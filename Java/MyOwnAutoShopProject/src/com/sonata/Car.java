package com.sonata;

public class Car {
	int speed;
	double regularPrice;
	String colour;
	public Car(int speed,double regularPrice,String colour) 
	{
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.colour=colour;
	}
	double getSalePrice(){
		return regularPrice;
	}	
}
