package a3;

public class ha2 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 10, 40 };
        int n = a.length;
        int x = 10;
        int res = binarySearch(a, x, 0, n - 1);
        System.out.println("Element to be searched is : "+ x);

        if (res == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index: " + res);
    }

    public static int binarySearch(int[] arr, int ele, int l, int r) {
        if (l > r) {
            return -1;
        }

        int m = l + (r - l) / 2; // Calculate the middle index

        if (arr[m] == ele) {
            return m; // Element found
        } else if (arr[m] > ele) {
            return binarySearch(arr, ele, l, m - 1);
        } else {
            return binarySearch(arr, ele, m + 1, r);
        }
    }
}
