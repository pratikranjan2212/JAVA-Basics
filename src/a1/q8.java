package a1;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array row & column size: ");
        int m=sc.nextInt(), n=sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int a=0;a<m;a++) {
            for (int b=0;b<n;b++) {
                sum+=arr[a][b];
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements: "+sum);
        sc.close();
    }

}
