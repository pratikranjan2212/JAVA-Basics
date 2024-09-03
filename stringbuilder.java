// import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Parker");
        // System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // sb.insert(0, 'B');
        // System.out.println(sb);

        // set char at index 0
        // sb.setCharAt(0, 'B');
        // System.out.println(sb);

        // sb.delete(2,3)

        StringBuilder sb = new StringBuilder("HelloWorld");
    
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;


            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);


            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
    }
}
