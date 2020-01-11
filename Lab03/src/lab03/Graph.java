package lab03;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println("");
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
    public void connect(int iArg, int jArg) throws IllegalArgumentException {
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                if(i==iArg&&j==jArg)
                {
                    graph[i][j] = 1;
                }
            }
        }
    }

    @Override
    public void writeList() {
        for(int i=0; i<size; i++)
        {   
            for(int j=0; j<size; j++)
            {
            if(graph[i][j]==1)
            {
             System.out.println("("+i+" , "+j+")");   
            }
            }
           
        }
    }
    
    public void topsWithNNeighbours(int nb) {
        int numberOfNB;
        for(int i=0; i<size; i++)
        {
           numberOfNB = 0;
           for(int j=0; j<size; j++)
           {
               if(graph[i][j]==1&&graph[i][i]!=1)
               {
                   numberOfNB++;
               }
           }
           if(numberOfNB==nb)
           {
             System.out.println(i);  
           }
        }
    }
    
    public void topsWithMostEdges()
    {
        int[] arrayOfTops = new int[size];
        int numberOfEdges;
        int max = 0;
        for(int i=0; i<size; i++)
        {
          numberOfEdges =0;
        for(int j=0; j<size; j++)
           {
               if(graph[i][j]==1&&j!=i)
               {
                arrayOfTops[i] = numberOfEdges++;
               }
           
               if(graph[j][i]==1&&j!=i)
               {
                   arrayOfTops[i] = numberOfEdges++;
               }
              }
        }
        for(int i=0; i<size; i++)
        {
        System.out.println("Wierzcholek "+i+" : "+arrayOfTops[i]);
        if(arrayOfTops[i]>max)
        {
          max = arrayOfTops[i];  
        }
       
        }
         System.out.println("===============");
        for(int i=0; i<size; i++)
        {
           if(arrayOfTops[i]==max)
        {
         System.out.println("Wierzcholek "+i+" : "+arrayOfTops[i]);
        } 
        }
        
        
    }
    
}
