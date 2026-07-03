//PROBLEM: Clear the bit (set to 0) at a specific position

public class ClearBit {
    public static void main(String args[]) {
        int n = 5; // Binary: 0101
        int pos = 2; // Position to clear
        
        // Create a bitMask by shifting 1 to the left by 'pos'
        int bitMask = 1 << pos;
        
        // Perform NOT operation on bitMask, then AND with number 'n'
        // This forces the bit at 'pos' to 0
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
    }
}