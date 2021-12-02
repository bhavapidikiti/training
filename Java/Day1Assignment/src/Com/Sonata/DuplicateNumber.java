package Com.Sonata;

public class DuplicateNumber {
	public static void main(String args[])
	{
		int[] arr = new int [] {2,3,4,4,6,5,6,9,0,9};
		int i,j;
		for(i=0;i<arr.length;i++)
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
					System.out.println(arr[j]);
			}
	}
}
