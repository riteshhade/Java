package Ass3;

public class Savingaccount extends Bankaccount{

	float interest;

	public Savingaccount(int accno, float bal, float interest) {
		super(accno, bal);
		this.interest = interest;
	}
	
	void addInterest()
	{
		System.out.println("Interest rate: "+(bal*0.2f));
	}
}
