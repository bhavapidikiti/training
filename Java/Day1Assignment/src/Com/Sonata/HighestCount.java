package Com.Sonata;

public class HighestCount {
	public static void main(String args[]) {
	int [] a = new int [] {3,5,10,20,20,6,7,6};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count ++;
				break;
			}
		}
	}
	System.out.println(count);		
}
}
