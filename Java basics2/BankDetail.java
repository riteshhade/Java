package Day;

public class BankDetail {
	public static void main(String[] args) {
		
		Bank b1 = new Bank(1234,"Ritesh",10000);
		b1.withdraw();
		b1.deposit();
		b1.interest();
	}

}
