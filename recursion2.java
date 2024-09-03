// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class recursion2 {
    public static void TowerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerofHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        TowerofHanoi(n-1, helper, src, dest);
    }

    public static void StringReverse(String str, int idx) {
        if (str.length() == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        StringReverse(str, idx-1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, char element, int idx) {
        if (idx == 0) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurence(str, element, idx+1);
    }

    public static boolean checkSorting(int arr[], int idx) {
        if (idx == arr.length-1) {
            return true;
        } if (arr[idx] > arr[idx+1]) {
            return false;
        }
        return checkSorting(arr, idx+1);
    }

    public static void moveChar(String str, int idx, int count, String newString) {
        // Base case
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx) == 'x') {
            count++;
            moveChar(str, idx+1, count, newString);
        } else {
            newString += str.charAt(idx);
            moveChar(str, idx+1, count, newString);
        }
    }

    public static boolean maparr[] = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        if (maparr[str.charAt(idx)-'a']) {
            removeDuplicates(str, idx+1, newString);
        } else {
            newString += str.charAt(idx);
            maparr[str.charAt(idx)-'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    // interview question
    public static void printSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        printSubsequence(str, idx+1, newString + str.charAt(idx), set);
        printSubsequence(str, idx+1, newString, set);
    }

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombinations(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printKeypadCombinations(str, idx+1, combination + mapping.charAt(i));
        }
    }

    // interview question
    public static void printPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newstr, permutation + str.charAt(i));
        }
    }

    public static int countPaths(int n, int m, int i, int j, String path) {
        if (i == n-1 && j == m-1) {
            System.out.println(path);
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }
        return countPaths(n, m, i+1, j, path + "R ") + countPaths(n, m, i, j+1, path + "D ");
    }

    public static int placeTiles(int n, int m) {
        if (n < m) {
            return 1;
        } if (n == m) {
            return 2;
        }
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }

    public static int invitePeople(int n) {
        if (n <= 1) {
            return 1;
        } 
        return invitePeople(n-1) + ((n-1) * invitePeople(n-2));
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.println(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i =- 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TowerofHanoi(2, "S", "H", "D");
        // StringReverse("Hello", "Hello".length()-1);
        // findOccurence("Hello", 'l', 0);
        
        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(checkSorting(arr, 0));
        
        // moveChar("axbcxxd", 0, 0, "");
        // removeDuplicates("aabbccdd", 0, "");

        // HashSet<String> set = new HashSet<>();
        // printSubsequence("aaa", 0, "", set);

        // printKeypadCombinations("23", 0, "");
        // printPermutations("abc", "");

        // System.out.println(countPaths(3, 3, 0, 0, ""));
        // System.out.println(placeTiles(4, 4));
        // System.out.println(invitePeople(4));

        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(3, subset);

    }
}
