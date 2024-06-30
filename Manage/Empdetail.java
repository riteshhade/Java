package Manage;

public class Empdetail {
	
	public static void main(String[] args) 
	{
		EmployeeManagement em = new EmployeeManagement();
		
		Employee[] e = new Employee[2];
		
		int choice=em.menu();
		switch(choice)
		{
		case 1: 
				em.createEmp();
				break;
				
		case 2:
			    em.display(e);
			    break;
		case 3:
			
				em.update(e);
				break;
				
		case 4:
				em.delete(e);
				break;
				
		case 5:
				System.out.println("Thank You!!!");
				break;
				
		default:
				System.out.println("Invalid choice");
		}
		
		Employee[] E =em.createEmp();
		em.display(E);
		em.update(E);
		em.display(E);
		em.delete(E);
		em.display(E);
		
		
	}

}
