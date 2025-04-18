package a1;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.println("Enter an element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int a=0;a<n;a++) {
            for (int b=0;b<n;b++) {
                if(a==b)
                    sum+=arr[a][b];
            }

        }
        System.out.println("Sum of major diagonal elements: "+sum);
        sc.close();
    }

}
