import java.util.Scanner;

public class throw_exception {
    public static void main(String[] args) {
        try {
            Colors obj = new Colors();
            obj.input();
            obj.display();
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}

//class NegativeArraySizeException extends Exception {
//    NegativeArraySizeException(String str) {
//        System.out.println(str);
//        System.out.println("Enter a size greater than zero");
//    }
//}

class Colors {
    Scanner sc = new Scanner(System.in);
    int n;
    String[] colors;

    Colors() throws NegativeArraySizeException {
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        if (n < 0)
            throw new NegativeArraySizeException("Array size cannot be less than zero");
        colors = new String[n];
    }

    void input() {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a color: ");
            colors[i] = sc.next();
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(colors[i] + " ");
        }
    }
}

