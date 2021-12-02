package Com.Sonata;

public class LargesrArray {
	public static void main(String args[]) {
		int a[]= {2,4,1,6,3,5};
		int max1,max2;
				if(a[0]<a[1])
				{
					max1=a[1];
					max2=a[0];
				}
				else
				{
					max1=a[0];
					max2=a[1];
					
				}
				for(int i=2;i<6;i++)
				{
					if(a[i]>max1)
					{
						max2=max1;
						max1=a[i];
					}
					if(a[i]<max1 && a[i]>max2)
					{
						max2=a[i];
					}
				}
				System.out.println(max1 + " "+ max2);
		}					
}
