// import java.util.Scanner;

public class recursion1 {
    public static void printNumbers(int x) {
        if (x == 6) {
            return;
        }
        System.out.println(x);
        printNumbers(x + 1);
    }

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void Fibonacci(int a, int b, int n) {
       if (n == 0){
        return;
       }
       int c = (a + b);
       System.out.print(c + " ");
       Fibonacci(b, c, n-1);
    }

    public static int printExponent(int x, int n) {
        if (x == 0) {
            return 0;
        } if (n == 0) {
            return 1;
        }
        int exp = printExponent(x, n-1);
        int pow = x * exp;
        return pow;
    }

    public static int printPow(int x, int n) {
        if (x == 0) {
            return 0;
        } if (n == 0) {
            return 1;
        } 
        
        if (x % 2 == 0){
            return printPow(x, n/2) * printPow(x, n/2);
        } else {
            return printPow(x, n/2) * printPow(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number upto which you want sum: ");
        // int n = sc.nextInt();
        // printSum(1, n, 0);
        // sc.close();

        // System.out.println(Factorial(5));


        // int a = 0, b = 1, n = 7;
        // System.out.print(a + " " + b + " ");
        // Fibonacci(a, b, n-2);

        // System.out.println(printExponent(2, 5));

        System.out.println(printPow(2, 5));
    }
}
