package Ass3;
import java.util.Scanner;
public interface Creditcard {
	
	void rupees(float amount);
	void dollars(float amount);
	void pounds(float amount);
	

}

class Bank implements Creditcard
{

	
	public void rupees(float amount)
	{
		
		System.out.println(amount+ "Amount paid using Rupees");
		
	}

	
	public void dollars(float amount) {
		System.out.println(amount+ "Amount paid using Dollar");
		
	}

	
	public void pounds(float amount) {
		System.out.println(amount+ "Amount paid using Pound");
		
	}
	
		
}

class Testinterface
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose an option from below: ");
		System.out.println("1.From Rupees");
		System.out.println("2.From Dollars");
		System.out.println("3.From Pound");
		System.out.println("4.exit");
		Creditcard c;
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			c = new Bank();
			c.rupees(5000);
			System.out.println("Thank For Banking!!");
			break;
			
		case 2:
			c = new Bank();
			c.dollars(5000);
			System.out.println("Thank For Banking!!");
			break;
			
		case 3:
			c = new Bank();
			c.pounds(5000);
			System.out.println("Thank For Banking!!");
			break;
																			
		case 4:
				
				System.out.println("Thank You For Banking with Us");
				System.out.println("Have a Great Day!!!");
		default:
			System.out.println("Invalid Option!!!");
		}
		
		
		
	
		
	}
}