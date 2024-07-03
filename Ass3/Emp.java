package Ass3;

public class Emp extends Person{
	
	int id;
	float sal;
	
	
	public Emp(String name, int age, int id, float sal)
	{
		super(name,age);
		this.id = id;
		this.sal = sal;
	}
	
	void myprofession()
	{
		System.out.println("My Profession : Java Developer");
	}
	
	void disp()
	{
		super.display();
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Salary: "+sal);
		
	}
}
