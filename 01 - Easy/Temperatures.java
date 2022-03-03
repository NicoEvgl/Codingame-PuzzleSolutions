import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt(); // the number of temperatures to analyse
            int closestTemp = (n == 0) ? 0 : in.nextInt(); // the temperature closest to zero.
                                                           // Display 0 if no temperature is provided.

            for (int i = 0; i < n - 1; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

                if (Math.abs(t) < Math.abs(closestTemp) || (t == -closestTemp && t > 0)) {
                    closestTemp = t;
                }
            }
            System.out.println(closestTemp);
        }
    }
}