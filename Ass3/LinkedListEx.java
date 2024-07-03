package Ass3;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		
		
//		Insert from begin
		ll.addFirst(100);
		System.out.println("After Insert from beginning");
		System.out.println(ll);
		System.out.println();
		
//		Insert at given pos
		ll.add(3, 300);
		System.out.println("After Insert at given pos");
		System.out.println(ll);
		System.out.println();
		
//		Insert after at\ given node
		System.out.println(" insert after  given node");
		ll.add(4+1, 200);
		System.out.println(ll);
		System.out.println();
		
//		Delete at begining
		System.out.println("After Deleting at beginning");
		ll.removeFirst();
		System.out.println(ll);
		System.out.println();
		
//		Delete at given position
		System.out.println("After Deleting at given position ");
		ll.remove(2);
		System.out.println(ll);
		System.out.println();

//		Delete after given node
		System.out.println("After deleting on given node");
		ll.remove(2+1);
		System.out.println(ll);
		System.out.println();
	}
}
