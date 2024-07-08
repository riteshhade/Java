package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHand 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("Temp1.txt");
//		
//		String str1 = "Hello Buddy!!!";
//		String str2 ="Welcome to Bangalore";
//		
//		fw.write(str1 + '\n');
//		fw.write(str2 + '\n');
		
//		Read From Console
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter message to display: ");
		String str=sc.nextLine();
		
		fw.write(str);
		fw.close();
		
//		
//		FileReader fr = new FileReader("Temp1.txt");
//		int ch;
//		int count =0;
//		
//		while((ch=fr.read())!=-1)
//		{
//			System.out.println((char)ch);
//			count++;
//			
//		}
//		System.out.println("Total Characters: "+count);
//		fr.close();
		
		//Line by line
		
		FileReader fr = new FileReader("Temp1.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String s1= br.readLine();
//		String s2 = br.readLine();
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		String str1=br.readLine();
		System.out.println(str1);
//		
		fr.close();
		br.close();
		
	}
}
