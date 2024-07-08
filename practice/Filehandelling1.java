package practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Filehandelling1 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Stud s1 = new Stud(101,"raj",87);
		Stud s2 = new Stud(102,"taj",97);
		Stud s3 = new Stud(103,"sham",77);
		Stud s4 = new Stud(104,"brian",47);
		Stud s5 = new Stud(105,"dom",67);
		
		FileOutputStream fo = new FileOutputStream("Temp.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		oo.writeObject(s1);
		oo.writeObject(s2);
		oo.writeObject(s3);
		oo.writeObject(s4);
		oo.writeObject(s5);
		
		fo.close();
		oo.close();
		
		System.out.println("file write over");
		
		FileInputStream fi = new FileInputStream("Temp.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
//		
//		Stud a1= (Stud) oi.readObject();
//		Stud a2= (Stud) oi.readObject();
//		Stud a3= (Stud) oi.readObject();
//		Stud a4= (Stud) oi.readObject();
//		Stud a5= (Stud) oi.readObject();
//		
//		a1.show();
//		a2.show();
//		a3.show();
//		a4.show();
//		a5.show();
//		
		
		
//		
		Stud s;
		try {
			
		
		while((s = (Stud)oi.readObject())!=null)
		{
			
			s.show();
			
			if(s.marks>35)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		}catch(EOFException e)
		{
			System.out.println("done");
		}
		fi.close();
		oi.close();
		
	} 
	
}
