import java.util.Scanner;

public class matrixarrays {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int array2[][] = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array 2:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array 1:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Search element
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        boolean found = false;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (array2[i][j] == element) {
                    found = true;
                    System.out.println("Element found at index " + i + " " + j);
                }
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
