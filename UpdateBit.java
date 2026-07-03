//PROBLEM: Update the bit at a specific position (set to 1 or 0 based on input)
import java.util.*;

public class UpdateBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // User input: oper=1 sets bit, oper=0 clears bit
        int oper = sc.nextInt();
        
        int n = 5;
        int pos = 1;
        
        int bitMask = 1 << pos;
        
        if(oper == 1) {
            // Set bit operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // Clear bit operation
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}