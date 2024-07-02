package DAC;
import java.util.Scanner;
public class Largest {
	public  void large(int a,int b,int c, int temp,int largest) {
		temp = a>b?a:b;
		
		largest =temp>c?temp:c;
		System.out.print("Largest Number is :" +largest);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number ");
		int c =sc.nextInt();
		int temp = 0,largest = 0;
		Largest l1 = new Largest();
		l1.large(a, b, c, temp, largest);
		sc.close();
	}
}
