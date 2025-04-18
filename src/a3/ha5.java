package a3;

public class ha5 {
    public static void main(String[] args) {
        System.out.println(reverse("hello", 4));
    }

    public static String reverse(String s, int l) {
        if (l == -1)
            return "";
        else
            return s.charAt(l)+reverse(s, l-1);
    }
}
