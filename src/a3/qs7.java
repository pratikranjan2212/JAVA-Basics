package a3;
import java.util.Scanner;

public class qs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }

    public static int factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
