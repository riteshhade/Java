package Ass3;

public class Book 
{
	String bname;
	float price;
	int qty;
	Author a;
	
	public Book(String bname, float price, int qty, Author a) 
	 {
		
		this.bname = bname;
		this.price = price;
		this.qty = qty;
		this.a = a;
	}
	
	void show()
	{
		System.out.println("Book Name: "+bname);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+qty);
		a.display();
	}
	
}
