package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandelling2 
{
	public static void main(String[] args) throws IOException
	{
		String msg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message:");
		msg=sc.nextLine();
		
		FileWriter fw = new FileWriter("TempFile.txt");
		fw.write(msg);
		
		fw.close();
		
//		
//		FileReader fr = new FileReader("TempFile.txt");
//		
//		int ch;
//		
//		while((ch=fr.read())!= -1)
//		{
//			System.out.println((char)ch);
//		}
//		fr.close();
//		
		
		FileReader fr = new FileReader("TempFile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String message = br.readLine();
		int l = message.length();
		System.out.println(message);
		System.out.println(l);
	}
}
