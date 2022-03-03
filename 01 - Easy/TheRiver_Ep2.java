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
            long r1 = in.nextLong();
            boolean multipleMeetingPoints = false;

            for (long i = r1; i > 0 && !multipleMeetingPoints; i--) {
                multipleMeetingPoints = (calcNextRiver(i) == r1);
            }
            System.out.println(multipleMeetingPoints ? "YES" : "NO");
        }
    }

    private static Long calcNextRiver(long actualRiver) {
        long nextRiver = actualRiver;

        while (actualRiver > 0) {
            nextRiver += actualRiver % 10;
            actualRiver -= actualRiver % 10;
            actualRiver /= 10;
        }
        return nextRiver;
    }
}