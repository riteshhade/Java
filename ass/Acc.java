package ass;



import java.util.Scanner;

public class Acc 
{
	int accno;
	String accname;
	float amount;
	float balance;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account no: ");
		accno = sc.nextInt();
		
		System.out.println("Enter the account holder name:" );
		accname=sc.next();
		
		System.out.println("Enter the amount: ");
		amount = sc.nextFloat();
		
		System.out.println("Balance amount: " );
		balance=sc.nextFloat(); 
		
	}
	
	void withdraw()
	{
		if(balance>1000) 
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient amount..... ");
		}
		System.out.println("Account balance: "+balance);
	}
	
	void deposite()
	{
		if (amount>50000)
		{
			System.out.println("please enter the PAN card info");
			balance = balance + amount;
		}
		else
		{
			balance = balance+amount;
		}
		System.out.println("Account Balance: "+balance);
	}
	
	void interest()
	{
		balance = balance+balance*0.02f;
		System.out.println("Total Account Balance with interest : "+balance);;
	}
	
	void display()
	{
		System.out.println("Account No: "+accno);
		System.out.println("Account holder name: "+accname);
		System.out.println("Account Balance: "+balance);
	}
}

