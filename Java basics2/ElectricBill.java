package Day;

public class ElectricBill {

	int custno;
	String name;
	int units;
	
	public ElectricBill(int custno, String name, int units)
	{
		
		this.custno = custno;
		this.name = name;
		this.units = units;
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
				System.out.println("Custno is :"+custno);
				System.out.println("name is : "+name);
				System.out.println("units are : "+units);
			}
	
}
