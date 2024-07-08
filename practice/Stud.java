package practice;

import java.io.Serializable;

public class Stud implements Serializable
{
	int id;
	String name;
	int marks;
	
	public Stud(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void show()
	{
		System.out.print(id + name + marks);
	}
}
