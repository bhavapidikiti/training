package Com.Sonata;

public class ArraySpecific {

	 public static void main(String args[]) {
		 int a[]= {1,2,3,4,5,6};
		 int b=4;
		 int i;
		 for( i=0;i<6;i++)
		 {
			 if(a[i]==b) {
				 System.out.println("yes, the value is present");
				 break;
			 }
		 }
		 if(i==6) {
			 System.out.println("no, the value is  not present");
		 }
		
	 }
}
