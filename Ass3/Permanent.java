package Ass3;

public class Permanent extends Emp {
	
	int Pid;
	String add;
	
	
	public Permanent(String name, int age, int id, float sal, int pid, String add) {
		super(name, age, id, sal);
		Pid = pid;
		this.add = add;
	}
	void myprofession()
	{
		System.out.println("My Profession : Sr.Manager");
	}
	void dis()
	{
		super.disp();
		System.out.println("Permanent id of Employee: "+Pid);
		System.out.println("Employees Address: "+add);
	}
	

}
