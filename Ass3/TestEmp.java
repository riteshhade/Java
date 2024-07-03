package Ass3;

public class TestEmp {
	public static void main(String[] args) 
	{
	HourlyEmp h = new HourlyEmp(123,"Raj","Thakur",65678);
	h.disp();
	h.computegrosspay();
	h.computenetpay();
	
	
	Salariedemp s =new Salariedemp(1234,"Shyam","thakkar",56577);
	s.disp();
	s.computegrosspay();
	s.computenetpay();
	}
}
