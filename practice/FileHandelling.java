package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandelling 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("Temp.txt");
		
		String str1="Hello Buddy";
		String str2= "Welcome to the Coding world";
		
		fw.write(str1 + '\n');
		fw.write(str2 + '\n');
		
		System.out.println("File Writer is over....");
		fw.close();
		
		
		//Read by char
		FileReader fr = new FileReader("Temp.txt");
		
		int ch;
		int count=0;
		int counter =0;
		while((ch=fr.read()) != -1)
		{
			System.out.println((char)ch);
			count++;
		if(ch==' ')
		{
			counter++;
		}
			
		}
		System.out.println();
		System.out.println(count);
		System.out.println(counter);
		
		//Read line by line
		
////		
//		FileReader FR = new FileReader("Temp.txt");
//		
//		BufferedReader br = new BufferedReader(FR);
//		
//		String s1=	br.readLine();
//		String s2=  br.readLine();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
		fr.close();
//		FR.close();
//		br.close();
		
		
	}
	
}
