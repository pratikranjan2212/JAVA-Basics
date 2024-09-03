public class bits {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int BitMask = 1 << pos;
        int notBitMask = ~(BitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

        if ((BitMask & n) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }
    }
}


// Write a program to find if a number is a power of 2 or not.
// Write a program to toggle a bit a position = “pos” in a number “n”.
// Write a program to count the number of 1’s in a binary representation of the number.
// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]