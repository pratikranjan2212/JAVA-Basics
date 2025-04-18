package a1;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt(),sum=0,product=1,onum=num;
		
		while (num>0) {
			sum=sum+num%10;
			product=product*(num%10);
			num=num/10;
		}
		
		if(product==sum)
			System.out.println(onum+" is a spy number");
		else
			System.out.println(onum+" is not a spy number");
		
		sc.close();
	}

}