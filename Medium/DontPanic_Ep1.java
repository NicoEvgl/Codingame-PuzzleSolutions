import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbFloors = in.nextInt(); // number of floors
        int width = in.nextInt(); // width of the area
        int nbRounds = in.nextInt(); // maximum number of rounds
        int exitFloor = in.nextInt(); // floor on which the exit is found
        int exitPos = in.nextInt(); // position of the exit on its floor
        int nbTotalClones = in.nextInt(); // number of generated clones
        int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
        int nbElevators = in.nextInt(); // number of elevators

        HashMap<Integer, Integer> elevatorsP = new HashMap<Integer, Integer>(); // Elevator's position by Floor

        for (int i = 0; i < nbElevators; i++) {
            int elevatorFloor = in.nextInt(); // floor on which this elevator is found
            int elevatorPos = in.nextInt(); // position of the elevator on its floor
            elevatorsP.put(elevatorFloor, elevatorPos);
        }

        // game loop
        while (true) {
            int cloneFloor = in.nextInt(); // floor of the leading clone
            int clonePos = in.nextInt(); // position of the leading clone on its floor
            String direction = in.next(); // direction of the leading clone: LEFT or RIGHT

            // check if there are an elevator or an exit at the clone floor,
            // if is true compare clone position with the elevator or exit position
            if (elevatorsP.containsKey(cloneFloor)) {
                int ePos = elevatorsP.get(cloneFloor);
                if (clonePos < ePos && direction.equals("LEFT")
                        || clonePos > ePos && direction.equals("RIGHT")) {
                    System.out.println("BLOCK");
                } else {
                    System.out.println("WAIT");
                }
            } else if (cloneFloor == exitFloor) {
                if (clonePos < exitPos && direction.equals("LEFT")
                        || clonePos > exitPos && direction.equals("RIGHT")) {
                    System.out.println("BLOCK");
                } else {
                    System.out.println("WAIT");
                }
            } else {
                System.out.println("WAIT");
            }
        }
    }
}