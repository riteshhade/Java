package ass;
import java.util.Scanner;
public class Student {
	
	int id;
	String name;
	int marks;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student Id :");
		id =sc.nextInt();
		
		System.out.println("Enter the student name :");
		name =sc.next();
		
		System.out.println("Enter the student marks :");
		marks =sc.nextInt();
		
		
		
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
