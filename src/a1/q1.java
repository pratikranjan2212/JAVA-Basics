package a1;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt(),count=0;
		
		System.out.println("The positive integer greater than 2 from command line argument is "+num);
		
		while(num>2) {
			num=num/2;
			count=count+1;
		}
		
		System.out.println("The no of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);
		
		sc.close();
	}

}