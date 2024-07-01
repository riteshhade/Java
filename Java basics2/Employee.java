package Day;

public class Employee {
	int empid;
	String name;
	String designation;
	String dept;
	float sal;
	
	public Employee(int empid, String name, String designation, String dept, float sal) {
		
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.dept = dept;
		this.sal = sal;
		
	}
		void display()
		{
			System.out.println("Employee id: " +empid);
			System.out.println("Employee name: " +name);
			System.out.println("Employee designation: " +designation);
			System.out.println("Employee dept: " +dept);
			System.out.println("Employee sal: " +sal);
			
			
		}
	

}
