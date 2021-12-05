package com.sonata;

public class StudentInfo {
	int stdID;
    String stdName;
    int stdClass;
    StudentInfo(int ID,String NAME,int CLASS){
        this.stdID=ID;
        this.stdName=NAME;
        this.stdClass=CLASS;
    }
    public void display(){
        System.out.println(stdID);
        System.out.println(stdName);
        System.out.println(stdClass);
        
    }
    
	public static void main(String[] args) {
		 StudentInfo s1 = new  StudentInfo(200,"",9);
		s1.display();
		 StudentInfo s2 = new  StudentInfo(746,"Bhavya",10);
		s2.display();
		
	}
}
