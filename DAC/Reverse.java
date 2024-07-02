package DAC;
import java.util.Scanner;
public class Reverse {
	
	public void Rev(int a) {
		
		while(a>0) {
			int rem = a%10;
			System.out.print(rem);
			a=a/10;
			
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num;
		num=sc.nextInt();
		
		Reverse R1 = new Reverse();
		R1.Rev(num);
		sc.close();
	}

}
