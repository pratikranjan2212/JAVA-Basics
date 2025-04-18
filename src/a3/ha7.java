package a3;

import java.util.Arrays;

public class ha7 {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {7, 2, 9, 4, 6, 1, 3, 8, 5};
        int k1 = 5;
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Pivot k = " + k1);
        partitionArray(arr1, k1);
        System.out.println("Partitioned array: " + Arrays.toString(arr1));
        
        // Additional test case
        int[] arr2 = {10, 5, 15, 20, 0, 8, 3, 11, 7};
        int k2 = 8;
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        System.out.println("Pivot k = " + k2);
        partitionArray(arr2, k2);
        System.out.println("Partitioned array: " + Arrays.toString(arr2));
    }
    
    /**
     * Partitions an array such that elements less than or equal to k come before elements greater than k
     * @param A the array to be partitioned
     * @param k the pivot value
     */
    public static void partitionArray(int[] A, int k) {
        if (A == null || A.length <= 1) {
            return; // Base case: array is empty or has only one element
        }
        
        partitionArrayRecursive(A, 0, A.length - 1, k);
    }
    

    private static void partitionArrayRecursive(int[] A, int start, int end, int k) {
        // Base case: if the partition has 0 or 1 elements, it's already sorted
        if (start >= end) {
            return;
        }
        
        // Pick first element as current element to process
        if (A[start] > k) {
            // If current element is greater than k, move it to the end
            // and recursively process the remaining array
            swap(A, start, end);
            partitionArrayRecursive(A, start, end - 1, k);
        } else {
            // If current element is less than or equal to k,
            // it's already in the correct position, so move to next element
            partitionArrayRecursive(A, start + 1, end, k);
        }
    }
    
    /**
     * Swaps two elements in an array
     * @param A the array
     * @param i index of first element
     * @param j index of second element
     */
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
