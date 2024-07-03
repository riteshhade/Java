package Ass3;

public class Testbank 
{
	public static void main(String[] args)
	{
		Checkingaccount c = new Checkingaccount(1234,5000,2000);
		c.deduct();
		Savingaccount s = new Savingaccount(1234,5000,1.2f);
		s.addInterest();
		
		Bankaccount b =new Bankaccount(123,5000);
		b.withdraw();
		b.deposit();
		b.getBalance();
	}

}
