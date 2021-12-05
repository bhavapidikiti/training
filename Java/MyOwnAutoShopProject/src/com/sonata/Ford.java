package com.sonata;

public class Ford extends Car {
	int year;
	int manufacturerDiscount;

	public Ford(int speed, double regularPrice, String colour,int year,int manufacturerDiscount)
	{
		super(speed, regularPrice, colour);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}

	public double getSalePrice(){
	    double salePrice=super.getSalePrice();
		return salePrice-(salePrice*((double)manufacturerDiscount/100.0));
	}
}
