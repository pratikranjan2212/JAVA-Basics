package a3;

public class ha3 {
    public static void main(String[] args) {
        // Test the decimalToBinary method with some examples
        System.out.println("Binary of 5: " + decimalToBinary(5));
        System.out.println("Binary of 10: " + decimalToBinary(10));
        System.out.println("Binary of 25: " + decimalToBinary(25));
        System.out.println("Binary of 100: " + decimalToBinary(100));
    }

    public static String decimalToBinary(int n) {
        // Base cases
        if (n == 0) {
            return "0";
        }

        if (n == 0) {
            return "0";
        }

        if (n > 0) {
            return decimalToBinary(n / 2) + (n % 2);
        }

        return "";
    }
}
