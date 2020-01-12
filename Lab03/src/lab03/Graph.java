package lab03;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author bielinskim
 */
public class Graph extends AGraph {

    int[][] graph = new int[size][size];
    
    
    public Graph(int vertexCount) {
        super(vertexCount);
    }

    
    
    @Override
    public void writeMatrix() {
        System.out.print("  ");
        for(int i=0; i<size; i++)
        {
          System.out.print(i+" ");
          
        }
        System.out.println("");
        for(int i=0; i<size; i++)
        {   System.out.print(i+" ");
            for(int j=0; j<size; j++)
            {
            System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean check(int i, int j) throws IllegalArgumentException {
        if(graph[i][j]==1){
            return true;
        }
        else {return false;}
    }

    @Override
    public void connect(int i, int j) throws IllegalArgumentException {graph[i][j] = 1;}

    @Override
    public void writeList() {
        for(int i=0; i<size; i++)
        {   
            System.out.print(i+" :");   
            for(int j=0; j<size; j++)
            {
            if(graph[i][j]==1&&i!=j)
            {
             System.out.print(" "+j);   
            }
            }
           System.out.println();   
        }
    }
    
    public void vertexesWithNNeighbours(int argNumberOfNeighbours) {
        int thisNumberOfNeighbours;
        for(int i=0; i<size; i++)
        {
           thisNumberOfNeighbours = 0;
           for(int j=0; j<size; j++)
           {
               if(graph[i][j]==1&&graph[i][i]!=1)
               {
                   thisNumberOfNeighbours++;
               }
           }
           if(thisNumberOfNeighbours==argNumberOfNeighbours)
           {
             System.out.println(i);  
           }
        }
    }
    
    public void vertexesWithMostEdges()
    {
        int[] numberOfEdgesForEachVertex = new int[size];
        int numberOfEdges;
        int max = 0;
        for(int i=0; i<size; i++)
        {
          numberOfEdges =0;
          for(int j=0; j<size; j++)
          {
               if(graph[i][j]==1&&j!=i)
               {
                numberOfEdgesForEachVertex[i] = numberOfEdges++;
               }
           
               if(graph[j][i]==1&&j!=i)
               {
                   numberOfEdgesForEachVertex[i] = numberOfEdges++;
               }
           }
        }
        for(int i=0; i<size; i++)
        {
        if(numberOfEdgesForEachVertex[i]>max)
        {
          max = numberOfEdgesForEachVertex[i];  
        }
       
        }
        for(int i=0; i<size; i++)
        {
           if(numberOfEdgesForEachVertex[i]==max)
        {
         System.out.println("Wierzcholek "+i+" : "+numberOfEdgesForEachVertex[i]);
        } 
        }
    }
    
    public void bfs(int vArg) {
        
        Queue<Vertex> Q = new ArrayDeque<>();
        for(int i=0; i<size-1; i++) {
            Q.add(new Vertex(0, false, 0, null));
        }
        Vertex vertex = new Vertex(vArg, true, 0, null);
        Q.add(vertex);
        System.out.println(vArg+" -> ");
        Vertex u = new Vertex(size, true, 0, null);
        while(!Q.isEmpty())
        {
            Vertex v = Q.remove();
            int j = v.getIndex();
            for(int i=0; i<size; i++) {
                if(graph[j][i]==1) {
                  
                  if(v.isVisited()) {
                     System.out.print(i+" -> ");
                     v.setIndex(i);
                     v.setVisited(true);
                     v.setDistance(v.getParent().getDistance()+1);
                     v.setParent(v);  
                     Q.add(v);
                   }
                  u = Q.peek();
                }
            }
        }
    }
    
}
