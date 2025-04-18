package a3;

public class qs8 {
    public static int power(int base, int exp){
        if (exp == 0) {
            return 1;
        } else {
            return base * power(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("5^3 = " + power(5, 3));
    }
}
