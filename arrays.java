import java.util.*;

public class arrays {

    public static void searchElement(int arr[], int element) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                System.out.println("Element found at index " + i);
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        // Search element
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        searchElement(arr, element);

        // Find max and min
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Check the order of array
        boolean ascending = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                ascending = false;
                break;
            }
        }
        if (ascending) {
            System.out.println("Array is in ascending order");
        } else {
            System.out.println("Array is not in ascending order");
        }
        
        sc.close();
    }
}
