package a1;
import java.util.Scanner;

public class qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of lines to be entered: ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter a line: ");
			arr[i] = sc.nextLine();
		}
		
		for(int j=n-1;j>=0;j--) {
			System.out.println(arr[j]);
		}
		
		sc.close();
	}

}
