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
            long n = in.nextInt();
            long sum = 0;

            for (int i = 1; i <= n + 1; i++)
                sum += (n / i) * i;

            System.out.println(sum);
        }
    }
}