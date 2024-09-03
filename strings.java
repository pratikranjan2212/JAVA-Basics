import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();

        // charAt() function
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        String name2 = "Peter";
        if (name.compareTo(name2) == 0) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }

        String name3 = name.substring(0, 5);
        System.out.println(name3);
    }

    

}
