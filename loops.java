import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for (int i = 0; i < 11; i++) {
        //     System.out.print(i + " ");
        // }
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // int sum = 0;
        // while (n > 0) {
        //     sum = sum + n;
        //     n--;
        // }
        // System.out.println("Sum is " + sum);
        // sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
        sc.close();
    }
}
