package Ass3;

import java.util.Scanner;

public class Salemp  extends Emp1
{
	double Basesal;

	public Salemp(String name, int ssn, double basesal) {
		super(name, ssn);
		Basesal = basesal;
	}
	
	void salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("From how many days employee is working?");
		int days = sc .nextInt();
		System.out.println("From how many hours employee is working?");
		int hr=sc.nextInt();
		 Basesal = Basesal+days*hr;
	}
	void display()
	{
		super.display();
		System.out.println("Salried employee sal: "+Basesal);
	}
}
