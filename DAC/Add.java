package DAC;
import java.util.Scanner;

public class Add {

	public static void add(int n1,int n2) 
	{
		
		int sum = n1+n2;
		System.out.println("Sum of numbers is : "+sum);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		
		int a;
		int b;
		a = sc.nextInt();
		b= sc.nextInt();
		
		add(a,b);
		sc.close();
		
	}
}
