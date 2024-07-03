package Ass3;
import java.util.Scanner;

public class Bankaccount {

	int accno;
	float bal;
	
	
	public Bankaccount(int accno, float bal) 
	{
		
		this.accno = accno;
		this.bal = bal;
	}
	
	void deposit()
	{
		System.out.println("Enter the amount that you want to deposit: ");
		Scanner sc =new Scanner(System.in);
		int amount = sc.nextInt();
		
		System.out.println("Your balance is : "+(bal=bal+amount));
		
	}
	
	void withdraw()
	{
		System.out.println("Enter the anount that you want to withdraw:");
		Scanner sc = new Scanner(System.in);
		int amount =sc.nextInt();
		
		if(bal<amount)
		{
			System.out.println("Insufficient Amount!!!!");
		}
		else
		{
			System.out.println("Amount Withdraw Successfully!!!!");
				
		}	
		bal=bal-amount;
	}
	
	void getBalance()
	{
		System.out.println("Your Balance: " +bal);
	}
	
	
}
