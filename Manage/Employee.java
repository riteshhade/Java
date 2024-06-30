package Manage;

public class Employee {
	int id;
	String name;
	double sal;
	
	
	
	public Employee(int id, String name, double sal) 
	{
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void show()
	{
		System.out.println("Employee Details Are :");
		System.out.println("Employee id is: " +id);
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee Sal is : "+sal);
	}
	
}
