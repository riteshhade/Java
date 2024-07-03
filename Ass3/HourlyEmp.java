package Ass3;
import java.util.Scanner;
public class HourlyEmp extends Employee
{

	float sal;

	public HourlyEmp(int ssn, String first, String last, float sal)
	{
		super(ssn, first, last);
		this.sal = sal;
	}
	
	void computegrosspay()
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Basic salary ,hra ,other: ");
//		int bsal = sc.nextInt();
//		int hra =sc.nextInt();
//		int oth = sc.nextInt();
//		int gross =bsal+hra+oth;
//		
//		System.out.println("Your gross salary: "+gross);
		
		float gsal;
		System.out.println("From how many days employee is working? ");
		int days= sc.nextInt();
		System.out.println("From how many hours employee is working? ");
		int hrs =sc.nextInt();
		
		gsal = sal+days*hrs;
		System.out.println(gsal);
	}
	
	void computenetpay()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Gross salary,Income Tax,pf,ptax: " );
		int grosssal=sc.nextInt();
		float itax =sc.nextFloat();
		float pf =sc.nextFloat();
		float ptax =sc.nextFloat();
		
		float netsal =grosssal-itax-pf-ptax;
		System.out.println("Your Net Salary: "+netsal);
		
		
	}
	
	void disp()
	{
		super.display();
		System.out.println("SSN: " +ssn + "First Name: "+ first +"Last: "+last);
	}
	
}
