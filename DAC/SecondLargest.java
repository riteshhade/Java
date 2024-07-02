package DAC;

public class SecondLargest {
	
	private static int getsecondlargest(int[] a ,int n)
	{
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[n-2];
	}
	
	public static void main(String[] args) {
		
		int a[]= {10,23,44,21,48};
		//int b[]= {112,7657,8767,343,534};
		
		System.out.println("Second Largest:"+getsecondlargest(a,5));
		//System.out.println("Second Largest: "+getsecondlargest(a,5));
		
	}

	

}
