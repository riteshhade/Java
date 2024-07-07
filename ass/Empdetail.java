package ass;
import java.util.Scanner;
public class Empdetail 
{
	int empid;
	String name;
	String designation;
	String dept;
	float sal;
	
	   
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Emp Id: ");
		empid =sc.nextInt();
		
		System.out.print("Enter the Emp Name: ");
		name =sc.next();
		
		System.out.print("Enter the Designation: ");
		designation =sc.next();
		
		System.out.print("Enter the dept: ");
		dept =sc.next();
		
		System.out.print("Enter the Emp Salary: ");
		sal =sc.nextFloat();
		
		
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(dept);
		System.out.println(sal);
		
	}
}
