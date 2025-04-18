package a3;

public class qs9 {
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        } else {
            return reverse(n / 10, rev * 10 + n % 10);
        }
    }
   
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number, 0);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
