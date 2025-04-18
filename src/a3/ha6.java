package a3;

public class ha6 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("hello", 2));
    }

    public static boolean checkPalindrome(String s, int m) {
        if (m <= 0)
            return true;
        else
            return s.charAt(m) == s.charAt(s.length()-m-1) && checkPalindrome(s,m-1);
    }
}
