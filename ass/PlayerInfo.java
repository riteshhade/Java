package ass;
import java.util.Scanner;
public class PlayerInfo {

	String name;
	int age;
	String country;
	int runs;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of player: ");
		name =sc.next();
		
		System.out.println("Enter the age of player: ");
		age =sc.nextInt();
		
		System.out.println("Enter the Country name of player: ");
		country =sc.next();
		
		System.out.println("Enter the runs of player: ");
		runs =sc.nextInt();
		
		
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
