import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor
 * seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int lightX = in.nextInt(); // the X position of the light of power
            int lightY = in.nextInt(); // the Y position of the light of power
            int initialTx = in.nextInt(); // Thor's starting X position
            int initialTy = in.nextInt(); // Thor's starting Y position

            // game loop
            while (true) {
                int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this
                                                   // line.

                String direction = "";

                // Define south or north Thor's direction.
                if (initialTy < lightY) {
                    direction += "S";
                    initialTy++;
                }
                if (initialTy > lightY) {
                    direction += "N";
                    initialTy--;
                }
                // Define east or west Thor's direction.
                if (initialTx < lightX) {
                    direction += "E";
                    initialTx++;
                }
                if (initialTx > lightX) {
                    direction += "W";
                    initialTx--;
                }
                // A single line providing the move to be made: N NE E SE S SW W or NW
                System.out.println(direction);
            }
        }
    }
}