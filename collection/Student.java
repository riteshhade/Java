package collection;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void show()
	{
		System.out.println("Student id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Marks: "+marks);
	}

}
