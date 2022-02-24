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
            int N = in.nextInt(); // Number of elements which make up the association table.
            int Q = in.nextInt(); // Number Q of file names to be analyzed.

            Map<String, String> mimeMap = new HashMap<String, String>();

            for (int i = 0; i < N; i++) {
                String EXT = in.next(); // file extension
                String MT = in.next(); // MIME type.
                mimeMap.put(EXT.toLowerCase(), MT);
            }
            System.err.println(mimeMap);

            in.nextLine();

            for (int i = 0; i < Q; i++) {
                String FNAME = in.nextLine().toLowerCase(); // One file name per line.

                if (FNAME.indexOf(".") == -1) { // If no extension
                    System.out.println("UNKNOWN");
                } else {
                    if (mimeMap.get(FNAME.substring(FNAME.lastIndexOf(".") + 1)) != null)
                        System.out.println(mimeMap.get(FNAME.substring(FNAME.lastIndexOf(".") + 1)));
                    else
                        System.out.println("UNKNOWN");
                }
            }
        }
    }
}