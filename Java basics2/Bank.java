package Day;

public class Bank {
	int accno;
	String name;
	float amount;
	
	public Bank(int accno, String name, float amount) {
		
		this.accno = accno;
		this.name = name;
		this.amount = amount;
	}
	
	void withdraw()
	{
		System.out.println("Rs. " +amount+ " is withdraw from your account");
	}
	
	void deposit()
	{
		System.out.println("Rs. " +amount+ " is withdraw from your account");
	}
	
	void interest()
	{
		System.out.println("You have 7.3pa Interest on your Saving Account");
	}

}
