package Graph.Representation;

public class GraphAdjMatrix {
    int vertex;
    int matrix[][];
    public GraphAdjMatrix(int v)
    {
        vertex=v;
        matrix=new int[v][v];
    }
    public void  addEdge(int source,int destination)
    {
        // add edge
        matrix[source][destination]=1;
        // add backEdge
        matrix[destination][source]=1;      // for undirected graph
    }
    public  void printGraph()
    {
        System.out.println("Graph:(Adjacency matrix)");
        for(int i=0;i<vertex;i++)
        {
            for (int j=0;j<vertex;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<vertex;i++)
        {
            System.out.print("vertex "+ i +"is connected to: ");
            for(int j=0;j<vertex;j++)
            {
                if (matrix[i][j]==1)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjMatrix graph= new GraphAdjMatrix(5);
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
