package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement 
{
	ArrayList<Student> createstudobject()
	{
		
	
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1001,"Ritesh",99);
		Student s2 = new Student(1002,"Abhijeet",35);
		Student s3 = new Student(1003,"Harsh",88);
		Student s4 = new Student(1004,"Aritra",95);
		Student s5 = new Student(1005,"Shushmita",85);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("Student Object Created");
		
		return al;
	}
	
	void displaystudobject(ArrayList<Student> al)
	{
		for(Student obj : al)
		{
			obj.show();
		}
	}
	
	void updatestud(ArrayList<Student>al)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stud id and marks to update ");
		int id =sc.nextInt();
		int mark =sc.nextInt();
		
		for(Student obj : al)
		{
			if(obj.id==id)
			{
				obj.marks=mark;
			}
		}
		
	}
	
	void deletestud(ArrayList<Student> al)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id to be deleted");
		int id=sc.nextInt();
		int pos=0;
		
		for(Student obj : al)
		{
			if(obj.id==id)
				{
					pos=al.indexOf(obj);
				}
			
		}
		al.remove(pos);
				
	}
}
