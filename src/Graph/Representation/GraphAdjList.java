package Graph.Representation;

import java.util.*;

public class GraphAdjList {
    public static void main(String[] args) {
        int v=5;
        List<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<v;i++)
        {
           adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(1).add(2);
        adj.get(3).add(2);
        adj.get(3).add(4);
        /*
        adj={
        {1,3},
        {2},
        {},
        {2,4},
        {}
        }
         */

        System.out.println("Neighbours of D are :");
        for(int s:adj.get(3))
        {
            System.out.print(s+" ");
        }


    }
}
