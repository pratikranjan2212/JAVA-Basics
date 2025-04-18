package a1;
import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		boolean bool = isOdd(num);
		System.out.println(num+" is odd: "+bool);
		sc.close();
	}

	public static boolean isOdd(int n) {
		return (n&1)!=0;
	}
}