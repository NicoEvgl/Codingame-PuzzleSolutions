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
            long r1 = in.nextLong(); // The first river.
            long r2 = in.nextLong(); // The second river.

            // Loop to find the meeting point between two meeting digital river
            while (r1 != r2) {
                if (r1 < r2) {
                    r1 = calcNextRiver(r1);
                } else {
                    r2 = calcNextRiver(r2);
                }
            }
            System.out.println(r1); // print out the meeting point
        }
    }

    // Extract river's digits and return their sum
    private static Long digitSum(long actualRiver) {
        if (actualRiver < 10) {
            return actualRiver;
        } else {
            long extract = actualRiver % 10;
            long remove_extract = actualRiver / 10;

            return extract + digitSum(remove_extract);
        }
    }

    // Calculate the next river : actual river + sum of its digits
    private static Long calcNextRiver(long actualRiver) {
        return actualRiver + digitSum(actualRiver);
    }
}