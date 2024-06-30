 package Manage;
import java.util.Scanner;
public class EmployeeManagement 
{
		 int menu()
		{
			System.out.println("choose from given below : ");
			System.out.println("1.Create Employee Id");
			System.out.println("2.Display Employee details");
			System.out.println("3.Update Employee Info");
			System.out.println("4.Delete Employee Info");
			System.out.println("5.Exit");
			
			Scanner sc =new  Scanner(System.in);
			int choice =sc.nextInt();
			return choice;
		}

		Employee[] createEmp()
		{
			
				Scanner s = new Scanner(System.in);
				System.out.println("How Many Employee Data you want to create: ");
				int numOfEmp=s.nextInt();
				Employee[] e = new Employee[numOfEmp];
			    for(int i=0; i<e.length;i++)
				{
			    	System.out.println("Enter Employee ID: ");
			    	int empNo = s.nextInt();
			    	System.out.println("Enter Employee Name: ");
			    	String name = s.next();
			    	System.out.println("Enter Employee Salary: ");
			    	float salary = s.nextFloat();
			    	e[i]= new Employee(empNo,name,salary);
				}
				System.out.println("New Employee Details Created Successfully.");

					
				return e;
				
			}

		
		void display(Employee[] e)
		{	
			
			for(int i= 0;i<e.length;i++)
			{
				e[i].show();
			}
			
		
		}
		
		void update(Employee []e) 
		{
				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Employee ID: ");
				int updateEmp= s.nextInt();
				boolean employeeFound = false;
				for(int i = 0;i < e.length; i++) {
					if(e[i].id == updateEmp) {
						System.out.println("Enter new Employee Salary: ");
						e[i].sal = s.nextFloat();
						employeeFound = true;
						System.out.println("Employee details Updated Successfully!");
						break;
					}
				}
				if(!employeeFound) {
				System.out.println("Employee with Employee Number " + updateEmp + " not found.");
				}

		}
		void delete(Employee []e)
		{
			
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Employee ID: ");
				int deleteEmp= s.nextInt();
				boolean employeeFound = false;
				for(int i = 0;i < e.length; i++) {
					if(e[i].id == deleteEmp) {
						e[i].id = 0;
						e[i].name = " ";
						e[i].sal = 0;
						employeeFound = true;
						System.out.println("Employee details Deleted Successfully!");
						break;
					}
			}
				if(!employeeFound) {
				System.out.println("Employee with Employee Number " + deleteEmp + " not found.");
				}
			}

		}

