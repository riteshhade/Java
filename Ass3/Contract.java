package Ass3;

public class Contract extends Emp {
	int tempid;
	String add;
	
	public Contract(String name, int age, int id, float sal, int tempid, String add) {
		super(name, age, id, sal);
		this.tempid = tempid;
		this.add = add;
	}
	
	void myprofession()
	{
		System.out.println("My Profession : HR");
	}
	
	void dis()
	{
		super.disp();
		System.out.println("Employess Temporary Id: "+tempid);
		System.out.println("Employess Address: "+add);
	}

}
