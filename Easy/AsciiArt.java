import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static final int INPUT_CHARACTERS = 27;

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        String ROW = "";
        for (int i = 0; i < H; i++) {
            ROW += in.nextLine();
        }
        T = T.toUpperCase();

        StringBuilder answer = new StringBuilder();
        for (int row = 0; row < H; row++) {
            for (char ch : T.toCharArray()) {
                int position = ch < 65 || ch > 90 ? 26 : ch - 65;
                int start = (L * INPUT_CHARACTERS) * row + position * L;
                answer.append(ROW.substring(start, start + L));
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}