public class patterns {
    public static void main(String[] args) {
        // Pattern 1: Solid Rectangle
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j <= 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 2: Hollow Rectangle
        // int m = 5, n = 4;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i == 1 || i == n || j == 1 || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Pattern 3: Half Pyramid
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 4: Inverted Half Pyramid
        // for (int i = 4; i >= 1; i--) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 5: Inverted Half Pyramid rotated 180 degrees
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 4-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 6: Half Pyramid using numbers
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Pattern 7: Inverted Half Pyramid using numbers
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5-i+1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Pattern 8: Floyd's Triangle
        // for (int i = 1, k = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(k + " ");
        //         k++;
        //     }
        //     System.out.println();
        // }

        // Pattern 9: 0-1 Triangle
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if ((i+j) % 2 == 0) {
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Pattern 10: Solid Rhombus
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Pattern 11: Number Pyramid
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(i + " ");
        //     }
           
        //     System.out.println();
        // }

        // Pattern 12: Palindromic Number Pyramid
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
           
        //     System.out.println();
        // }

        // Pattern 13: Butterfly Pattern
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     int space = 8 - 2*i;
        //     for (int j = 1; j <= space; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     int space = 8 - 2*i;
        //     for (int j = 1; j <= space; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Pattern 14: Diamond Pattern
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 4-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2*i-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) {
        //     for (int j = 1; j <= 4-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2*i-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Pattern 15: Hollow Butterfly Pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 8 - 2*i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 8 - 2*i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
