public class backtracking {
    public static void printPermutations(String str, String permutation, int idx) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newstr, permutation + str.charAt(i), idx+1);
        }
    }

    
    public static void main(String[] args) {
        printPermutations("ABC", "", 0);
        
    }
}
