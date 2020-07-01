package Graph.Representation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphAdjacencyListUsingMap {
    private Map<Integer, List<Integer>> Adjacency_list;

    public  GraphAdjacencyListUsingMap(int vertices)
    {
        Adjacency_list=new HashMap<>();
        for(int i=1;i<=vertices;i++)
        {
            Adjacency_list.put(i,new LinkedList<>());
        }

    }
    public void setEdge(int source,int destination)
    {
        if(source>Adjacency_list.size() || destination>Adjacency_list.size())
        {
            System.out.println("Vertex entered is not present");
            return;
        }
        List<Integer> slist=Adjacency_list.get(source);
        slist.add(destination);
        List<Integer> dlist=Adjacency_list.get(destination);
        dlist.add(source);
    }
    public List<Integer> getEdge(int source)
    {
        if (source>Adjacency_list.size())
        {
            System.out.println("Vertex entered is not present");
            return null;
        }
        return Adjacency_list.get(source);
    }


    public static void main(String[] args) {
        int v=10;
        GraphAdjacencyListUsingMap  adjacencyList=new GraphAdjacencyListUsingMap(v);
        adjacencyList.setEdge(1,2);
        adjacencyList.setEdge(1,3);
        adjacencyList.setEdge(1,4);
        adjacencyList.setEdge(2,5);
        adjacencyList.setEdge(3,8);
        adjacencyList.setEdge(3,10);
        adjacencyList.setEdge(4,8);
        adjacencyList.setEdge(4,6);
        adjacencyList.setEdge(4,7);
        adjacencyList.setEdge(5,6);
        adjacencyList.setEdge(7,9);
        adjacencyList.setEdge(8,9);
        adjacencyList.setEdge(9,10);
        System.out.println("the adjacency list for the graph \n");
        for (int i=1;i<=v;i++)
        {
            System.out.print(i+"->");
            List<Integer> edgeList=adjacencyList.getEdge(i);
            for (int j=1;;j++)
            {
                if(j!=edgeList.size())
                {
                    System.out.print(edgeList.get(j-1)+"->");
                }
                else {
                    System.out.print(edgeList.get(j -1));
                    break;
                }
            }
            System.out.println();
        }



    }
}
