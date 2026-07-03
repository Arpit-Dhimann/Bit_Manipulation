//PROBLEM: Check if the bit at a specific position is 0 or 1

public class GetBit {
    public static void main(String args[]) {
        // Binary representation: 0101
        int n = 5;
        // Position of the bit we want to check (starts from 0 at the right)
        int pos = 2;

        // Step 1: Create a bitMask by shifting 1 to the left by 'pos' positions
        // For pos=2, 1 << 2 makes it 0100
        int bitMask = 1 << pos;

        // Step 2: Use bitwise AND (&) operation
        // If the bit at pos is 0, result will be 0.
        // If the bit at pos is 1, result will be non-zero.
        if((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}