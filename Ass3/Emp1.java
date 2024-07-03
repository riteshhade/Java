package Ass3;

import java.util.Scanner;

public class Emp1 {
	String name;
	int ssn;
	
	public Emp1(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	
	void salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of employee: ");
		double sal = sc.nextDouble();
		System.out.println("Salary of the Employee :  "+sal);
	}
	void display()
	{
		System.out.println("Name of Employee:  "+name);
		System.out.println("SSN : "+ssn);
	}
}
