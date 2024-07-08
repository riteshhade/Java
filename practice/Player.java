package practice;

import java.util.Scanner;

public class Player 
{
	String name;
	int age;
	String country;
	int run;
	
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name Player: ");
		name=sc.next();
		
		System.out.println("Enter the age of player: ");
		age=sc.nextInt();
		
		System.out.println("Enter the Country Name: ");
		country=sc.next();
		
	}
}
