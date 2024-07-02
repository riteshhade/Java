package DAC;
import java.util.Scanner;
public class SimpleInterest {

	public void SI(int a,float b,int c) {
		
		float total = a*b*c/100;
		System.out.print("The interest on amount is " +total);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principle Amount: ");
		int pr = sc.nextInt();
		System.out.print("Enter Interest Rate: ");
		float r = sc.nextFloat();
		System.out.print("Enter the Time: ");
		int t =sc.nextInt();
		
		SimpleInterest s = new SimpleInterest();
		s.SI(pr,r,t);
		sc.close();
	}
}
