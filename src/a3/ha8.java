package a3;

public class ha8 {
    public static void main(String[] args) {
        // Testing with 3 disks
        int n = 3;
        System.out.println("Solution for Towers of Hanoi with " + n + " disks:");
        solveTowers(n, 'A', 'C', 'B');
        
        // Testing with 4 disks
        n = 4;
        System.out.println("\nSolution for Towers of Hanoi with " + n + " disks:");
        solveTowers(n, 'A', 'C', 'B');
    }

    public static void solveTowers(int n, char source, char destination, char auxiliary) {
        // Base case: if only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary peg using destination as the temp
        solveTowers(n - 1, source, auxiliary, destination);
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        // Move n-1 disks from auxiliary to destination using source as the temp
        solveTowers(n - 1, auxiliary, destination, source);
    }
}
