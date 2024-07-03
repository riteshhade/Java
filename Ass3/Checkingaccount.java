package Ass3;

public class Checkingaccount extends Bankaccount {

	float fees;

	public Checkingaccount(int accno, float bal, float fees) {
		super(accno, bal);
		this.fees = fees;
	}
	
	void deduct()
	{
		if(bal<fees)
		{
			System.out.println("Insufficient Amount!!!!");
		}
		else
		{
			System.out.println("Amount Withdraw Successfully!!!!"+(bal=bal-fees));	
		}
		bal=bal-fees;
		System.out.println("Your Balance: " +bal);
	}
	
}
