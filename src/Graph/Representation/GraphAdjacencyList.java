package Graph.Representation;

import java.util.LinkedList;

public class GraphAdjacencyList {
    int vertices;
    LinkedList<Integer>  list[];
    public GraphAdjacencyList(int v)
    {
        vertices=v;
        list= new LinkedList[v];
        for (int i=0;i<v;i++)
        {
            list[i]=new LinkedList<>();
        }
    }
    public void addEdge(int source,int destination)
    {
        // add edge
        list[source].addFirst(destination);
        // undirected (Add back edge)
        list[destination].addFirst(source);
    }
    public void printGraph()
    {
        for (int i=0;i<vertices;i++)
        {
           if(list[i].size()>0)
           {
               System.out.print("vertes "+ i + "is connected to :");
               for (int j=0;j<list[i].size();j++)
               {
                   System.out.print(list[i].get(j)+" ");
               }
               System.out.println();
           }
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList graph= new GraphAdjacencyList(5);
        graph.printGraph();

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.printGraph();

    }
}
