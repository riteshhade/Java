package Ass3;

public class Teacher extends Person 
{
	int sal;
	String spl;
	
	public Teacher(String name, int age, int sal, String spl) {
		super(name, age);
		this.sal = sal;
		this.spl = spl;
	}
	
	void myprofession()
	{
		System.out.println("My Profession : Java Trainer");
	}
	
	void show()
	{
		super.display();
		System.out.println("Teacher's Salary: "+sal);
		System.out.println("Teacher's Specialisation: "+spl);
	}
	
}
