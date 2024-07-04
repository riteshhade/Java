package collection;

import java.util.ArrayList;

public class Teststud 
{
	public static void main(String[] args) {
		
	
	StudentManagement st = new StudentManagement();
	
	ArrayList<Student> a= st.createstudobject();
	
	st.displaystudobject(a);
	
	st.updatestud(a);
	
	System.out.println("After update: ");
	
	st.displaystudobject(a);
	
	st.deletestud(a);
	
	System.out.println("After deletion: ");
	
	st.displaystudobject(a);
	
	}
	
	
			
}
