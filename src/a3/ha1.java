package a3;

public class ha1 {
    public static void main(String[] args) {
        System.out.println(gcd(12, 8)); // 4
    }

    public static int gcd(int x, int y) {
        if (x%y == 0)
            return y;
        else
            //noinspection SuspiciousNameCombination
            return gcd(y, x%y);
    }
}
