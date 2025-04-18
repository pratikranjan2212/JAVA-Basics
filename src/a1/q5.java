package a1;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int s = sum_Of_Digits(num);
		while(true) {
			if (s<10) {
				System.out.println("Sum: "+s);
				break;
			} else {
				s = sum_Of_Digits(s);
			}
		}
		sc.close();
	}
	
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while (n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}