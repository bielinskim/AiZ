package lab03;

/**
 *
 * @author Student
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
