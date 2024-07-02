package DAC;
import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		
		
		double res;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Choose a operator + ,- ,* ,/ ,%");
		char op = sc.next().charAt(0);
		switch(op) {
		
		case '+' :
			  res = a+b;
			 System.out.print("The addition of " + a + " and " + b + " is: "+res);
			 break;
		
		case '-' :
			  res = a-b;
			 System.out.print("The substraction of " + a + " and " + b + " is: "+res);
			 break;
			 
		case '*' :
			 res = a*b;
			 System.out.print("The Multiplication of " + a + " and " + b + " is: "+res);
			 break;
			 
		case '/' :
			 res = a/b;
			 System.out.print("The Division of " + a + " and " + b + " is: "+res);
			 break;
			 
		case '%' :
			 res = a%b;
			 System.out.print("The reminder of " +a+ " and " +b+ " is: "+res);
			 break;
			 
		default:
			System.out.println("Invalid Input !!");
			break;
		}
		
		sc.close();
		
	}
}
