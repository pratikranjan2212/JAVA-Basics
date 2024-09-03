import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();
    //     if (age < 18) {
    //         System.out.println("You are a minor");
    //     } else if (age >= 18 && age < 60) {
    //         System.out.println("You are an adult");
    //     } else {
    //         System.out.println("You are a senior citizen");
    //     }
    // }
    
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
