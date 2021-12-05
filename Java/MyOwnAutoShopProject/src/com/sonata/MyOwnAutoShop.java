package com.sonata;

public class MyOwnAutoShop {
public static void main(String[] args){
		
		Sedan S =new Sedan(250,650000,"red",25);
		
		Ford F1 =new Ford(225,700000,"blue",2015,15);
		
		Ford F2 =new Ford(300,900000,"Brown",2019,8);
		
		Car C =new Car(175,350000,"White");
		
		System.out.println("The Sale Price of Sedan S : " + S.getSalePrice());
		
		System.out.println("The Sale Price of Ford F1 : " + F1.getSalePrice());
		
		System.out.println("The Sale Price of Ford F2 : " + F2.getSalePrice());
		
		System.out.println("The Sale Price of Car C : " + C.getSalePrice());


	}
}
