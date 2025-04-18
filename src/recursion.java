import java.util.Scanner;
public class recursion {
	
	public static int recursiveSum(int n){
		if (n==1)
			return 1;
		else
			return n + recursiveSum(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no to get its sum: ");
		int num = sc.nextInt();
		System.out.println("Sum: "+recursiveSum(num));
	}

}
