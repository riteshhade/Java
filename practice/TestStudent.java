package practice;

public class TestStudent 
{
	int id;
	String name;
	int marks;
	String result;
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.read();
		s1.show();
		s1.result();
	}
}
