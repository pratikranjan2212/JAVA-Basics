package a3;

public class qs5 {
    public static <E> void printArray(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);
    }
}
