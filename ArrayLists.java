import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); // [1, 2, 3]
        // get elements
        System.out.print(list.get(0) + " "); // 1
        System.out.print(list.get(1) + " "); // 2
        System.out.print(list.get(2) + " "); // 3

        System.out.println();
        // set elements
        list.set(0, 4);
        list.set(1, 5);

        System.out.println(list); // [4, 5, 3]

        // add elements in between
        list.add(1, 6);
        System.out.println(list); // [4, 6, 5, 3]

        // remove elements
        list.remove(2);
        System.out.println(list); // [4, 6, 3]

        // list size
        System.out.println(list.size()); // 3

        // sorting
        Collections.sort(list);
        System.out.println(list); // [3, 4, 6]

        // remove all elements
        list.clear();
        System.out.println(list); // []
    }
}
