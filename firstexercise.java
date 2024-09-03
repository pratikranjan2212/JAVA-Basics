import java.util.Scanner;

public class firstexercise {
    public static int printAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("The average is " + average);
        sc.close();
        return average;
    }

    public static int printOddSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int oddsum = 0;
        for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                oddsum += i;
            }
        }
        sc.close();
        System.out.println("The sum of odd numbers is " + oddsum);
        return oddsum;
    }

    public static int checkGreater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
            sc.close();
            return a;
        } else {
            System.out.println(b + " is greater than " + a);
            sc.close();
            return b;
        }
    }

    public static float printCircumference() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r = sc.nextFloat();
        float circumference = 2 * 3.14f * r;
        System.out.println("The circumference is " + circumference);
        sc.close();
        return circumference;
    }

    public static void VotingEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
        sc.close();
    }

    public static void CountNumbers() {
        Scanner sc = new Scanner(System.in);
        int countZero = 0, countPositive = 0, countNegative = 0;
        int input = 1;

        while (input == 1) {
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            if (n == 0) {
                countZero++;
            } else if (n > 0) {
                countPositive++;
            } else if (n < 0) {
                countNegative++;
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Number of zeros: " + countZero);
        System.out.println("Number of positive numbers: " + countPositive);
        System.out.println("Number of negative numbers: " + countNegative);
        sc.close();
    }

    public static int FindExponent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("The result is " + result);
        sc.close();
        return result;
    }

    public static int FindGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The GCD is " + gcd);
        sc.close();
        return gcd;
    }

    public static int printFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
        return n;
    }
    public static void main(String[] args) {
        // printAverage();
        // printOddSum();
        // checkGreater();
        // printCircumference();
        // VotingEligibility(); 
        // CountNumbers(); 
        // FindExponent();
        // FindGCD();
        // printFibonacci();
    }
}
