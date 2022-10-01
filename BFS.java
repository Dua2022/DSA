package Graphs;
import java.util.*;
public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph(6,true,true);
        g.addEdge(0,1);
        g.addEdge(1,2,6);
        g.addEdge(2,3);
        g.addEdge(3,4,8);
        g.addEdge(4,5,1);
        g.printEdges();
        g.printMatrix();
        g.hasEdge(3,2);
        g.getEdgeValue(1,1);
        System.out.println("Does an edge from 1 to 0 exist?");
        if (g.hasEdge(0,1)) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }


}

