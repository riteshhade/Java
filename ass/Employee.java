package ass;

public class Employee {

	int empid;
	String name;
	String designation;
	String dept;
	float Sal;
	
	public static void main(String[] args)
	{
		Empdetail e1 = new Empdetail();
		
		e1.read();
		e1.display();
		
	}
}
