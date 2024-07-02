package DAC;
import java.util.Scanner;
public class EvenOdd {

	public void search(int n) 
	{
	
		if (n%2==0)
		{
			System.out.println("The given number " +n+ " is Even Number");
		} 
		else 
		{
			System.out.println("The given number " +n+ " is Odd Number");
		}
		
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	
	int a = sc.nextInt();
	
	EvenOdd E1 = new EvenOdd();
	E1.search(a);
	sc.close();
	}
}
