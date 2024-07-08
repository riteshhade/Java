package practice;

import java.util.Scanner;

public class Emp
{
	int empno;
	String ename;
	String desg;
	String dept;
	double sal;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the empid: ");
		 empno=sc.nextInt();
		
		System.out.println("Enter the Employee Name; ");
		 ename = sc.next();
		
		System.out.println("Enter the designation: ");
		desg= sc.next();
		
		System.out.println("Enter the dept: ");
		dept= sc.next();
		
		System.out.println("Enter the salary of Employee: ");
		sal=sc.nextDouble();
	}
	
	void show()
	{
		System.out.println("Employee No: "+empno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Designation: "+desg);
		System.out.println("Employee Department: "+dept);
		System.out.println("Employee Salary: "+sal);
	}
	
}
