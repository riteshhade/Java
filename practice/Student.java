package practice;

import java.util.Scanner;

public class Student
{
	int id;
	String name;
	int mark;
	String result;
	
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		id = sc.nextInt();
		
		System.out.println("Enter name of student: ");
		name=sc.next();
		
		System.out.println("Enter the marks of student: ");
		mark=sc.nextInt();	
	}
	void result()
	{
		if(mark>35)
		{
			System.out.println("Congratulations!!!! Your are Passed");
		}
		else
		{
			System.out.println("Please Work hard again!!!");
		}
		
	}
	void show()
	{
		System.out.println("Stuent id: "+id);
		System.out.println("Name of student: "+name);
		System.out.println("Marks of student: "+mark);
		
		
	}
}
