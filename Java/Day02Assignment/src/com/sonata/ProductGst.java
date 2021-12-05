package com.sonata;

public class ProductGst {
	int ProID;
    String ProName;
    double ProPrice ;
    ProductGst(int ID,String NAME,double PRICE,int GST){
        this.ProID=ID;
        this.ProName=NAME;
        this.ProPrice=PRICE;
        double tax=GST* this.ProPrice/100;
        this.ProPrice=this.ProPrice+tax;
    }
    public void display(){
        System.out.println(ProID);
        System.out.println(ProName);
        System.out.println(ProPrice);
        
    }
    
	public static void main(String args[]) {
	    int GST=28;
		ProductGst s1 = new ProductGst(333,"BALL",28,GST);
		s1.display();
		ProductGst s2 = new ProductGst(234,"BAT",250,GST);
		s2.display();
		
	}
}
