package a3;

public class qs6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element == item) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5, 1};
        System.out.println("Count of 1 in Integer Array: " + count(intArray, 1));

        // String array
        String[] strArray = {"apple", "banana", "apple", "orange"};
        System.out.println("Count of 'apple' in String Array: " + count(strArray, "apple"));
    }
}
