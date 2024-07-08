package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashBook
{
	public static void main(String[] args)
	{
		HashMap<Integer,Book> hm = new HashMap<>();
		
		Book b1 = new Book(10,"abc",200);
		Book b2 = new Book(123,"def",500);
		Book b3 = new Book(517,"xyz",700);
		
		hm.put(b1.id,b1);
		hm.put(b2.id, b2);
		hm.put(b3.id, b3);
		
		for(Map.Entry<Integer, Book> m : hm.entrySet())
		{
			System.out.println(m.getKey()+ " ");
			m.getValue().show();
			System.out.println();
		}
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Key to delete book: ");
		 int k=sc.nextInt();
		 
		 hm.remove(k);
		 
		 for(Map.Entry<Integer, Book> m : hm.entrySet())
			{
				System.out.println(m.getKey()+ " ");
				m.getValue().show();
				System.out.println();
			}
		 System.out.println("Enter key to Update the Price: ");
		 int n=sc.nextInt();
		 Book b = hm.get(n);
		 b.price =1000;
		 
		 for(Map.Entry<Integer, Book> m : hm.entrySet())
			{
				System.out.println(m.getKey()+ " ");
				m.getValue().show();
				System.out.println();
			}
		 
	}
}
