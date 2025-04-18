package a3;

public class ha4 {
    public static int multiply(int a, int b) {
        // Base cases
        if (b == 0 || a == 0)
            return 0;
        if (b < 0)
            return -multiply(a, -b);
        if (a==1)
            return b;
        if (b == 1)
            return a;

        else {
            return a + multiply(a, b - 1);
        }
    }
    
    public static void main(String[] args) {
        // Test the recursive multiplication method
        int a = 5;
        int b = 3;
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        
        // Test with negative numbers
        int c = -4;
        int d = 6;
        System.out.println(c + " * " + d + " = " + multiply(c, d));
        
        // Test with zero
        System.out.println("0 * 7 = " + multiply(0, 7));
        
        // Test with larger numbers
        System.out.println("8 * 9 = " + multiply(8, 9));
    }
}
