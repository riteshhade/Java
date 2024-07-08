package practice;

import java.util.HashMap;
import java.util.Map;

public class Hash
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "Virat Kohli");
		hm.put(2, "Rohit Sharma");
		hm.put(3, "Surya");
		hm.put(4, "Y.Jaiswal");
		hm.put(5, "S.Gill");
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() + " ");
			System.out.println(m.getValue()+ " ");
			System.out.println();
		}
		
		String value = hm.get(1);
		System.out.println(value);
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() + " ");
			System.out.println(m.getValue()+ " ");
			System.out.println();
		}
		
		hm.remove(3);
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() + " ");
			System.out.println(m.getValue()+ " ");
			System.out.println();
		}
		
		
	}
}
