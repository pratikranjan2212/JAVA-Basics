package a3;
import java.util.Scanner;

public class qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int n = sc.nextInt();
        try{
            if (n < 0)
                throw new NumberFormatException("Lucky number cannot be less than zero");
            else
                System.out.println("Your lucky number is: " + n);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

