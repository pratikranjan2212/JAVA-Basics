package a1;
import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0],min_index=0, c1=0;
        int max = arr[0],max_index=0, c2=0;

        for (int j=0;j<n;j++) {
            if (arr[j]>max) {
                max=arr[j];
                max_index=j;
            } if(arr[j]<min) {
                min=arr[j];
                min_index=j;
            }
        }

        for (int k=0;k<n;k++) {
            if (arr[k]==min)
                c1++;
            if (arr[k]==max)
                c2++;
        }

        System.out.println("Max element: "+max+" and occurs "+c2+" times");
        System.out.println("Min element: "+min+" and occurs "+c1+" times");
        System.out.println("First occurrence of max element: "+max_index);
        System.out.println("First occurrence of min element: "+min_index);
        sc.close();
    }

}
