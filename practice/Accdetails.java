package practice;

import java.util.Scanner;

public class Accdetails
{
	public static void main(String[] args)
	{	
		Account a = new Account();
		a.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("choose an option from below: ");
		System.out.println("1.Withdraw Amount");
		System.out.println("2.Deposite Amount");
		System.out.println("3.Interest on bank account");
		System.out.println("4.display bank details");
		System.out.println("5.exit");
		
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1: 
				a.withdraw();
				break;
				
		case 2:
				a.deposite();
				break;
				
		case 3: a.interest();
				break;
				
		case 4:
				a.display();
				break;
				
		case 5:
				System.out.println("Thank You for choosing us!!!!");
				break;
		
		default:
			
			System.out.println("Invalid choice!!!");
			
		}
		
		
		
	}
}
