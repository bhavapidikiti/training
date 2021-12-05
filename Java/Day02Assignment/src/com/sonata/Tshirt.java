package com.sonata;

public class Tshirt {
	String color;
	String material;
	String design;
	public Tshirt(String color,String material,String design) {
		this.color=color;
		this.material=material;
		this.design=design;
	}
	public void display() {
		System.out.println("color : "+this.color);
		System.out.println("material : "+this.material);
		System.out.println("design : "+this.design);
		
	}
	public static void main(String args[]){
		Tshirt small= new Tshirt("Blue","cutton","V-shape");
		System.out.println("The fields of small Tshirt :");
		small.display();
		
		Tshirt large= new Tshirt("Black","silk","halter");
		System.out.println("The fields of large Tshirt :");
		large.display();
		
		
		Tshirt xtralarge= new Tshirt("black","nylon","boat");
		System.out.println("The fields of xtralarge Tshirt :");
		xtralarge.display();
		
	}	
}
