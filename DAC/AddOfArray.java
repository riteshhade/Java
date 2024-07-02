package DAC;

public class AddOfArray {
	
	static int arr[] = {10,20,30,40,50};
	
	static int sum() {
		int sum =0;
		int i;
		
		for(i=0 ; i<arr.length; i++) {
			
			sum = sum+=arr[i];
		}
		return sum;
	}
	
public static void main(String[] args)
	{
	System.out.print("Addition of elements of array : "+ sum());
	}
}
