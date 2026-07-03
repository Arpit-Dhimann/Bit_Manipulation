//PROBLEM: Set the bit at a specific position to 1

public class SetBit {
    public static void main(String args[]) {
        int n = 5; // Binary: 0101
        int pos = 1; // Position to set
        
        // Create a bitMask by shifting 1 to the left by 'pos'
        int bitMask = 1 << pos;

        // Perform OR operation: if bit is 0, it becomes 1; if 1, stays 1
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}