package DAC;
public class MaxMin 
{
	 static int getMax(int a[],int n) 
	 {
		 int res = a[0];
		 for(int i=0;i<n;i++) {
			 
			 	res =Math.max(res, a[i]);	 	
		 	}
		 return res;	 
	 }
	 
	 static int getMin(int a[],int n)
	 {
		 
		 int res =a[0];
		 for(int i = 0 ;i<n ;i++) 
		 {
			 
			 res = Math.min(res, a[i]);
		 }
		 return res;
	 }
  public static void main(String[] args) 
  {
	
	 int a[] = {10,20,30,40,50};
	 int n = a.length;
	 
	 System.out.println	("The largest number is: " +getMax(a,n));
	 System.out.print("The min number is: "+getMin(a,n));
	 
  }
}
