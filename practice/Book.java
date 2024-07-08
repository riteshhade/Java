package practice;

public class Book 
{
	int id;
	String name;
	float price;
	public Book(int id, String name, float price)
	{
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void show()
	{
		System.out.println(id+name+price);
	}
}
