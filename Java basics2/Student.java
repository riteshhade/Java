package Day;

public class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void result()
	{
		if(marks>35)
		{
			System.out.println("Student is Passed");
		}
		else
		{
			System.out.println("Student is failed");
		}
		
	}
	void display()
	{
		System.out.println("Student id :" +id);
		System.out.println("Student name: " +name );
		System.out.println("Student marks: "+marks);
		
	}
	
	
}
