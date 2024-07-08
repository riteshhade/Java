package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String>hm= new HashMap<>();
		hm.put(1, "Pune");
		hm.put(2, "Mumbai");
		hm.put(3, "Delhi");
		hm.put(4, "Hyderabad");
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String>m:hm.entrySet())
		{
			System.out.println(m.getKey() + " ");
			System.out.println(m.getValue()+ " ");
			System.out.println(" ");
		}
		
		String value=hm.get(1);
		System.out.println(value);
		
		
		 hm.remove(2);
		for(Map.Entry<Integer, String>m:hm.entrySet())
		{
			System.out.println(m.getKey() + " ");
			System.out.println(m.getValue()+ " ");
			System.out.println(" ");
		}
		
	}
}
