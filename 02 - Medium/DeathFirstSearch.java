import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt(); // the total number of nodes in the level, including the gateways
            int L = in.nextInt(); // the number of links
            int E = in.nextInt(); // the number of exit gateways

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>(N); // 2-D ArrayList represent graph (Nodes,Links);
            ArrayList<Integer> gateways = new ArrayList<>(E); // ArrayList get exit gateways nodes.
            Integer startNode = 0; // Start node of a link (Nx)
            Integer endNode = N - 1; // End node of a link (Ny)
            Integer exitNode = E; // "Active" Exit gateway

            for (int i = 0; i < N; i++) {
                graph.add(new ArrayList<>()); // initialize each element of ArrayList with another ArrayList.
            }

            for (int i = 0; i < L; i++) {
                int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
                int N2 = in.nextInt();
                graph.get(N1).add(N2); // add Links in our ArrayList 2-D
            }

            for (int i = 0; i < E; i++) {
                int EI = in.nextInt(); // the index of a gateway node
                gateways.add(EI); // add exit gateway node to ArrayList
                exitNode = gateways.get(i); // Integer exiteNode take exit gateways nodes values
            }

            // game loop
            while (true) {
                int SI = in.nextInt(); // The index of the node on which the Bobnet agent is positioned this turn
                System.err.println("Agent Position (SI) : " + SI);

                int linkedCount = graph.get(SI).size(); // count numbers of links from Agent Position
                for (int j = 0; j < linkedCount; j++) {
                    startNode = SI; // Start Node is always Agent Position
                    endNode = graph.get(SI).get(j); // node j connected with Agent Position & in range of linkedCount
                }

                if (E > 1) {
                    for (int i = 0; i < gateways.size(); i++) {
                        if (graph.get(SI).contains(gateways.get(i)) || graph.get(gateways.get(i)).contains(SI)) {
                            exitNode = gateways.get(i); // the nearest gateways of Agent Postion begin exitNode
                        }
                    }
                }
                System.err.println("Nearest gateways : " + exitNode);

                if (graph.get(SI).contains(exitNode) || graph.get(exitNode).contains(SI)) {
                    endNode = exitNode; // The end Node of the link begin exit gateway node
                    System.out.println(startNode + " " + endNode); // link to destroy (Agent Position, Gateway)
                } else {
                    System.out.println(startNode + " " + endNode); // link to destroy (Agent Position, connected node)
                }
            }
        }
    }
}