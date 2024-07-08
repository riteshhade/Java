package practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHand2
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		FileOutputStream fo = new FileOutputStream("Temp2.txt");
		ObjectOutputStream oo= new ObjectOutputStream(fo);
		Employee e1 = new Employee(12,"Tej",50000);
		Employee e2 = new Employee(14,"Brian",78000);
		Employee e3 = new Employee(15,"Scott",34000);
		Employee e4 = new Employee(11,"jacob",55000);
		Employee e5 = new Employee(16,"crystine",80000);
		
		oo.writeObject(e1);
		oo.writeObject(e2);
		oo.writeObject(e3);
		oo.writeObject(e4);
		oo.writeObject(e5);
		
		System.out.println("File Write done");
		oo.close();
		
		FileInputStream fi = new FileInputStream("Temp2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Employee e;
		try {
			
		
		while((e =(Employee) oi.readObject()) != null )
		{
			e.disp();
		}
		}catch(EOFException f) {
			System.out.println("done");
		}

	}
}
