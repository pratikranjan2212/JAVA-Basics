import java.util.*;

public class practice {
    public static void main(String[] args) {
        // List<Integer> marks = new ArrayList<>(Arrays.asList(45, 67, 98, 24, 35, 67, 89, 23, 56, 78));
        // int count1, count2, count3, count4;
        // count1 = count2 = count3 = count4 = 0;
        // for (int i = 0; i < marks.size(); i++) {
        //     if (marks.get(i) >= 81 && marks.get(i) <= 100) {
        //         count1++;
        //     } else if (marks.get(i) >= 61 && marks.get(i) <= 80) {
        //         count2++;
        //     } else if (marks.get(i) >= 41 && marks.get(i) <= 60) {
        //         count3++;
        //     } else {
        //         count4++;
        //     }
        // }
        // System.out.println("Number of students with marks between 81 and 100: " + count1);
        // System.out.println("Number of students with marks between 61 and 80: " + count2);
        // System.out.println("Number of students with marks between 41 and 60: " + count3);
        // System.out.println("Number of students with marks between 0 and 40: " + count4);

        // 6.12
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of cloth: ");
        String cloth = sc.nextLine();
        System.out.println("Enter the purchase amount: ");
        int amount = sc.nextInt();
        if ((amount >= 0) && (amount <= 100)) {
            switch (cloth) {
                case "Handloom":
                    System.out.println("Net amount: " + amount*0.95);
                    break;

                default:
                    System.out.println("Invalid cloth type");
                    break;
            }
        } else if ((amount > 100) && (amount <= 200)) {
            switch (cloth) {
                case "Handloom":
                    System.out.println("Net amount: " + amount*0.925);
                    break;

                case "Mill":
                    System.out.println("Net amount: " + amount*0.95);
                    break;

                default:
                    System.out.println("Invalid cloth type");
                    break;
            }
        } else if ((amount > 200) && (amount <= 300)) {
            switch (cloth) {
                case "Handloom":
                    System.out.println("Net amount: " + amount*0.90);
                    break;

                case "Mill":
                    System.out.println("Net amount: " + amount*0.925);
                    break;

                default:
                    System.out.println("Invalid cloth type");
                    break;
            }
        } else if (amount > 300) {
            switch (cloth) {
                case "Handloom":
                    System.out.println("Net amount: " + amount*0.85);
                    break;
                    
                case "Mill":
                    System.out.println("Net amount: " + amount*0.90);
                    break;

                default:
                    System.out.println("Invalid cloth type");
                    break;
            }
        } else {
            System.out.println("Invalid amount");
        }
        sc.close();
    }
}
