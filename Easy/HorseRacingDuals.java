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
            int N = in.nextInt();
            ArrayList<Integer> powersList = new ArrayList<Integer>();

            for (int i = 0; i < N; i++) {
                int pi = in.nextInt();
                powersList.add((Integer) (pi));
            }

            Collections.sort(powersList);
            int answer = Math.abs(powersList.get(0) - powersList.get(1));

            for (int i = 1; i < N - 1; i++) {
                if (Math.abs(powersList.get(i) - powersList.get(i + 1)) < answer)
                    answer = Math.abs(powersList.get(i) - powersList.get(i + 1));
            }
            System.out.println(answer);
        }
    }
}