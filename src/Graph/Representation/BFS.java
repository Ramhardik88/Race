package Graph.Representation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BFS {
    private  int v;
    private LinkedList<Integer>[] adj;

    BFS(int vertex)
    {
        v=vertex;
        adj=new LinkedList[vertex];
        for(int i=0;i<vertex;i++)
        {
            adj[i]=new LinkedList<>();
        }

    }
    public  void addEdge(int u,int v)
    {
        adj[u].add(v);
      //    adj[v].add(u);     for undirected
    }
    public void BFSGraph(int s)
    {
        LinkedList<Integer> Q=new LinkedList<>();
        Boolean visitedArray[]= new Boolean[v];
        Q.add(s);
        visitedArray[s]=true;
        while (Q.size()!=0)
        {
            s=Q.poll();
            System.out.print(s+" ");

            Iterator<Integer> i=adj[s].listIterator();
            while (i.hasNext())
            {
                int n=i.next();
                if(!visitedArray[n])
                {
                    visitedArray[n]=true;
                    Q.add(n);
                }
            }

        }
    }

    public static void main(String[] args) {
        BFS bfs= new BFS(5);
        bfs.addEdge(0,1);
        bfs.addEdge(0,4);
        bfs.addEdge(1,2);
        bfs.addEdge(1,3);
        bfs.addEdge(1,4);
        bfs.addEdge(2,3);
        bfs.addEdge(3,4);
        bfs.BFSGraph(1);

    }

}
