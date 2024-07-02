package DAC;
import java.util.Scanner;
public class Calculator {
		
		public static void add(int a,int b) 
		{
			System.out.print(a+b);
		}
		
		public static void sub(int a ,int b) 
		{
			System.out.print(a-b);
		}
		
		public static void mul(int a,int b) 
		{
			System.out.print(a*b);
		}
		public static void div(int a,int b) 
		{
			
			System.out.println(a/b);	
		}
		public static void main(String[] args) 
		{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose method which u want to perform:+,-,*,/");
		char op = sc.next().charAt(0);
		
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		
		switch (op) {
		case '+' :{
					add(a,b);
		        }
				break;
		
		case '-' :
				{
					sub(a,b);
				}
				break;
		
		case '*' :
				{
					mul(a,b);
				}
				break;
				
		case '/' :
			{
				div(a,b);
			}
				break;
				
		default:
			System.out.println("Invalid Input!!!!");
		}
		sc.close();
	}

}
