package Ass3;

public class Employee 
{
	int ssn;
	String first;
	String last;
	
	public Employee(int ssn, String first, String last) {
		
		this.ssn = ssn;
		this.first = first;
		this.last = last;
	}
	
	void display()
	{
		System.out.println("Enter Employee Details: ");
		System.out.println("Enter SSN: "+ssn);
		System.out.println("Enter First Name: "+first);
		System.out.println("Enter Last Name: "+last);
	}
	
	
}
