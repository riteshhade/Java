package Day;

public class Player {
	String name;
	int age;
	static String country;
	int runs;
	
	public Player(String name, int age, int runs) {
		
		this.name = name;
		this.age = age;
		
		this.runs = runs;
	}
	
	void changeLoc()
	{
		country = "India";
	}
	void display()
	{
		if(runs > 5000)
		{
			System.out.println(name);
			System.out.println(age);
			System.out.println(country);
			System.out.println(runs);
			
		}
	}
	
	
}
