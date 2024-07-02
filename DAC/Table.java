package DAC;
import java.util.Scanner;
public class Table 
{
	public static int Tab(int a)
	{
		for(int i =1 ; i<=10;i++)
		{
			System.out.println(a*i);		
		}
		return a;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number:");
		
		int num =sc.nextInt();
		Tab(num);
		sc.close();
	}
}
