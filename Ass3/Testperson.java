package Ass3;

public class Testperson {
	public static void main(String[] args) {
		
		Permanent p = new Permanent("Ram",27,1234,450000,123455,"Manager");
		p.myprofession();
		p.dis();
		System.out.println();
		
		
		Emp e = new Emp("Shiv",23,5745,200000);
		e.myprofession();
		e.disp();
		System.out.println();

		
		Teacher t = new Teacher("nsnathan",40,550000,"Java Trainer");
		t.myprofession();
		t.show();
		System.out.println();
		
		Contract c = new Contract("Brian",40,578,677778,1234,"HR");
		c.myprofession();
		c.dis();
		
	}
}
