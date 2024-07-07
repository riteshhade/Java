package ass;
import java.util.Scanner;
public class Ebill {

	int Custno;
	String name;
	int units;
	
	void read() {
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer No: ");
		Custno =sc.nextInt();
		
		System.out.println("Enter the customer Name: ");
		name =sc.next();
		
		System.out.println("Enter the Units: ");
		units =sc.nextInt();		
	}
	}
	
	void computebill()
	{
		float price;
		if(units <= 100)
		{
			price = units*1.20f;
			System.out.println("Bill is Rs. "+ price);
		}
		else if(units > 100 && units<=300)
		{
			price = 100*1.20f + (units-100)*2.20f;
			System.out.println("Bill is Rs. "+price);
		}
		else if(units>300 && units<=600)
		{
			price =100*1.20f + 200*2.20f + (units-300)*3.0f;
			
			System.out.println("Bill is Rs. "+price);
		}
		
	}
	void display()
	{
		System.out.println("Custno is :"+Custno);
		System.out.println("name is : "+name);
		System.out.println("units are : "+units);
	}
}
