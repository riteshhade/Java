package practice;

import java.util.Scanner;

public class Ebill
{
	int custno;
	String cname;
	int units;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer No: ");
		custno = sc.nextInt();
		
		System.out.println("Enter the name of customer: ");
		cname = sc.next();
		
		System.out.println("Enter the number of units consumed: ");
		units=sc.nextInt();
		
	}
	
	void show()
	{
		System.out.println("Customer No: "+custno);
		System.out.println("Customer Name: "+cname);
		System.out.println("Units Consumed: "+units);
	}
	
	void computebill()
	{
		float charges;
		
		if(units<=100)
		{
			charges= units*1.20f;
			System.out.println("Bill to be pay: "+charges);
		}
		else if(units>100 && units<=300)
		{
			charges = 100*1.20f+(units-100)*2.00f;
			System.out.println("Bill to be pay: "+charges);
		}
		else if(units>300 &units<=600)
		{
			charges=100*1.20f+200*2.00f+(units-200)*3.00f;
			System.out.println("Bill to be pay: "+charges);
		}
		else
			charges=units*5.00f;
	}
}
