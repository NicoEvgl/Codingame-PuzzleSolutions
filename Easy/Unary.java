import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class Solution {
    public static void main(String[] args) {
        // Read input.
        Scanner scanner = new Scanner(System.in);
        String MESSAGE = scanner.nextLine();
        String BINARY = ""; // Convert input message to binary representation.

        for (int i = 0; i < MESSAGE.length(); i++) {
            String charInBinary = Integer.toBinaryString((int) MESSAGE.charAt(i));

            charInBinary = "0000000".substring(charInBinary.length()) + charInBinary; // Fill binary representation with
                                                                                      // zeroes to get 7 bit.
            BINARY += charInBinary;
        }

        // Convert binary representation in "Chuck Norris Code".
        char lastChar = ' ';
        String codedMessage = "";
        String[] encodedBits = new String[] { " 00 0", " 0 0" };

        for (int i = 0; i < BINARY.length(); i++) {
            if (BINARY.charAt(i) != lastChar) {
                lastChar = BINARY.charAt(i);
                codedMessage += encodedBits[lastChar - '0'];
            } else {
                codedMessage += "0";
            }
        }
        // Print encoded message.
        System.out.println(codedMessage.substring(1));
    }
}