package Ass3;

public class CommissonEmp extends Emp1{
	
	double sales;
	double comm;
	
	public CommissonEmp(String name, int ssn, double sales, double comm)
	{
		super(name, ssn);
		this.sales = sales;
		this.comm = comm;
	}
	
	void salary()
	{
		if(sales>200)
		{
			comm=comm*0.07;
		}
		else if(sales>100)
		{
			comm=comm*0.04;
		}
		else 
		{
			comm =comm*0.02;
		}
		
	}
	void display()
	{	
		super.display();
		System.out.println("Commission is: "+comm);
		System.out.println("Sales are: "+sales);
	}
	
}
