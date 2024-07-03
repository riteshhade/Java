package Ass3;

import java.util.Scanner;

public class HrEmp extends Emp1{
	
	double wage;
	double hr;
	
	
	public HrEmp(String name, int ssn, double wage, double hr) {
		super(name, ssn);
		this.wage = wage;
		this.hr = hr;
	}
	
	void salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("From How many days employee is working?");
		int days=sc.nextInt();
		wage = wage+days*hr;
		
	}
	void display()
	{
		super.display();
		System.out.println("Wages of Employee: "+wage);
		System.out.println("Working hours of Employee: "+hr);
	}

}
