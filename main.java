import java.util.*;

class FirstClass {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        // System.out.print("The sum is: ");
        // System.out.print(sum);
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}