public class sorting {
    public static void divide(int array[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            divide(array, si, mid);
            divide(array, mid + 1, ei);
            conquer(array, si, mid, ei);
        }
    }

    public static void conquer(int array[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int i1 = si, i2 = mid + 1, x = 0;

        while (i1 <= mid && i2 <= ei) {
            if (array[i1] < array[i2]) {
                merged[x++] = array[i1++];
            } else {
                merged[x++] = array[i2++];
            }
        }
        while (i1 <= mid) {
            merged[x++] = array[i1++];
        }
        while (i2 <= ei) {
            merged[x++] = array[i2++];
        }
        for (int i = si; i <= ei; i++) {
            array[i] = merged[i - si];
        }
    }
    public static void main(String[] args) {
        int array[] = {6, 3, 9, 5, 2, 8};
        int n = array.length;
        // Bubble sort
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (array[j] > array[j + 1]) {
        //             int temp = array[j];
        //             array[j] = array[j + 1];
        //             array[j + 1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Bubble sort: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(array[i] + " ");
        // }

        // Selection sort
        // for (int i = 0; i < n - 1; i++) {
        //     int smallest = i;
        //     for (int j = i + 1; j < n; j++) {
        //         if (array[j] < array[smallest]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = array[smallest];
        //     array[smallest] = array[i];
        //     array[i] = temp;
        // }
        // System.out.println("Selection sort: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(array[i] + " ");
        // }

        // Insertion sort
        // for (int i = 1; i < n; i++) {
        //     int key = array[i];
        //     int j = i - 1;
        //     while (j >= 0 && array[j] > key) {
        //         array[j + 1] = array[j];
        //         j--;
        //     }
        //     array[j + 1] = key;
        // }
        // System.out.println("Insertion sort: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(array[i] + " ");
        // }

        // Merge sort
        
        divide(array, 0, n - 1);
        System.out.print("Merge sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
