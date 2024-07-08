package practice;

import java.io.Serializable;

public class Employee implements Serializable
{
	int id;
	String name;
	float sal;
	
	public Employee(int id, String name, float sal)
	{
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	void disp()
	{
		System.out.println(id+name+sal);
	}
	
}
