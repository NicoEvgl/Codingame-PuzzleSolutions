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
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int x = X0;
        int y = Y0;

        int xMin = -1;
        int yMin = -1;
        int yMax = H;
        int xMax = W;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
if(bombDir.equals("U")){
                yMax = y;
                System.out.println(x + " " + (y-((yMax-yMin)/2)));
                y = (y-((yMax-yMin)/2));
            }
            else if(bombDir.equals("D")){
                yMin = y;
                System.out.println(x + " " + (y+((yMax-yMin)/2)));
                y = (y+((yMax-yMin)/2));
                
            }
            else if(bombDir.equals("L")){
                xMax = x;
                System.out.println((x-((xMax-xMin)/2)) + " " + y);
                x = (x-((xMax-xMin)/2));
            }
            else if(bombDir.equals("R")){
                xMin = x;
                System.out.println((x+((xMax-xMin)/2)) + " " + y);
                x = (x+((xMax-xMin)/2));
            }
            else if(bombDir.equals("UR")){
                xMin = x;
                yMax = y;
                System.out.println((x+((xMax-xMin)/2)) + " " + (y-((yMax-yMin)/2)));
                x = (x+((xMax-xMin)/2));
                y = (y-((yMax-yMin)/2));
            }
            else if(bombDir.equals("UL")){
                xMax = x;
                yMax = y;
                System.out.println((x-((xMax-xMin)/2)) + " " + (y-((yMax-yMin)/2)));
                x = (x-((xMax-xMin)/2));
                y = (y-((yMax-yMin)/2));
            }
            else if(bombDir.equals("DR")){
                xMin = x;
                yMin = y;
                System.out.println((x+((xMax-xMin)/2)) + " " + (y+((yMax-yMin)/2)));
                x = (x+((xMax-xMin)/2));
                y = (y+((yMax-yMin)/2));
            }
            else if(bombDir.equals("DL")){
                xMax = x;
                yMin = y;
                System.out.println((x-((xMax-xMin)/2)) + " " + (y+((yMax-yMin)/2)));
                x = (x-((xMax-xMin)/2));
                y = (y+((yMax-yMin)/2));
            }
        }
    }
}