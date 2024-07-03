package Ass3;

public class EmpTest {
	public static void main(String[] args) {
		
	CommissonEmp c = new  CommissonEmp("Champak",1234,200,1500);
		c.salary();
		c.display();
		System.out.println();
		
		HrEmp h = new HrEmp("Chandu",1233,20000,8);
		h.salary();
		h.display();
		System.out.println();
		
		Salemp s = new Salemp("Tillu",456,25000);
		s.salary();
		s.display();
		
	}

}
