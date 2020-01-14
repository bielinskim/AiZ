package lab03;

import java.util.LinkedList;

/**
 *
 * @author bielinskim
 */
public class Graph extends AGraph {

    private int[][] graph = new int[size][size];
    
    private boolean[] visited;
    private int[] start;
    private int[] end;
    private int[] parent;
    private int time;
    
    
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
      try {
        if(i<=size&&j<=size) {
          if(graph[i][j]==1){return true;}
          else {return false;}}
        else {
           throw new IllegalArgumentException();
          }
      }  
      catch(IllegalArgumentException a) {System.err.println("Niepoprawny parametr");} 
      finally {return false;}
    }

    @Override
    public void connect(int i, int j) throws IllegalArgumentException {
       try {
        if(i<=size&&j<=size&&i!=j) {
          graph[i][j] = 1;
        }
        else {
           throw new IllegalArgumentException();
          }
      }  
      catch(IllegalArgumentException a) {System.err.println("Niepoprawny parametr");} 
      finally {}
    }

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
    
    
    /* public void bfs(int vArg) {
        
        Queue<Vertex> Q = new ArrayDeque<>();
        List<Vertex> vertices = new ArrayList();
        for(int i=0; i<size; i++) {
            vertices.add(new Vertex(false, 0, null));
        }
        Vertex v = vertices.get(vArg);
        v.setVisited(true);
        Vertex u;
        Q.add(v);
        System.out.print(vArg);
        
        while(!Q.isEmpty())
        {
            v = Q.remove();
            int i = vertices.indexOf(v);
            for(int j=0; j<size; j++) {
                u = vertices.get(j);
                if(graph[i][j]==1&&!u.isVisited()) {
                     
                     System.out.print(" -> "+j);
                     u.setVisited(true);
                     u.setDistance(v.getDistance()+1); 
                     System.out.print(" (Odległość od v: "+u.getDistance()+")");
                     Q.add(u);
                }
            }
        }
        System.out.print(" || Pozostałe: ");
        for(int i=0; i<size; i++) {
            u = vertices.get(i);
            if(!u.isVisited()) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }   */
    
    public void bfs(int vArg) {
        
        LinkedList<Integer> Q = new LinkedList<>();
        boolean[] visited = new boolean[size];
        int[] distance = new int[size];
        for(int i=0; i<size; i++) {
            
            visited[i] = false;
        }
        visited[vArg] = true;
        Q.add(vArg);
        int v;
        
        System.out.print(vArg);
        
        while(!Q.isEmpty())
        {
            v = Q.remove();                                                     // remove zdejmuje pierwszy element z listy
            for(int u=0; u<size; u++) {
                if(graph[v][u]==1&&!visited[u]) {
                     System.out.print(" -> "+u);
                     visited[u] = true;
                     distance[u] = distance[v]+1;
                     System.out.print(" (Odległość od v: "+distance[u]+")");
                     Q.add(u);                                                   // add dodaje na koniec
                }
            }
        }
        System.out.print(" || Pozostałe: ");
        for(int i=0; i<size; i++) {
            if(!visited[i]) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }   
    
    public void dfs() {
        visited = new boolean[size];
        start = new int[size];
        end = new int[size];
        parent = new int[size];
        time = 0;
        parent[0] = -1;
        for(int i=0; i<size; i++) {
            
            visited[i] = false;
            start[i] = end[i] = 0;
        }
        for(int i=0; i<size; i++) {
            if(!visited[i]) {
                visit(i);
            }
        }
        System.out.println();
        for(int i=0; i<size; i++) {
            
            System.out.println("Poczatek: "+start[i]);
            System.out.println("Koniec: "+end[i]);
            System.out.println("Rodzic "+parent[i]);
        }
    }
    public void visit(int u) {
            visited[u] = true;
            time = time +1;
            start[u] = time;
            System.out.print(u+" -> ");
            for(int i=0; i<size; i++) {
                if(graph[u][i]==1&&!visited[i]) {
                    parent[i] = u;
                    
                    visit(i);
                }
            }
            time = time+1;
            end[u] = time;
        }
}
