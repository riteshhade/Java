package ass;

public class ElectricBill {
	
	int custno;
	String name;
	int units;
	
	public static void main(String[] args) {
		
		Ebill e1 =  new Ebill();
		e1.read();
		e1.computebill();
		e1.display();
	}
	
}
