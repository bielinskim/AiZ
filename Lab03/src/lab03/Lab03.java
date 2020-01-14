package lab03;

/**
 *
 * @author bielinskim
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Graph graph = new Graph(5);
        graph.connect(0, 1);
        graph.connect(1, 2);
        graph.connect(2, 2);
        graph.connect(2, 4);
        graph.connect(4, 3);
        graph.connect(3, 2);
        graph.connect(3, 1);
        graph.connect(1, 3); 
        
        System.out.println(graph.check(2, 4));
        System.out.println(graph.check(0, 4));
        System.out.println("==== Macierz sąsiedztwa grafu ====");
        graph.writeMatrix();
        System.out.println("==== Lista sąsiedztwa grafu ====");
        graph.writeList();
        
        System.out.println("==== Wierzchołki z 2 sasiadami: ====");
        graph.vertexesWithNNeighbours(2);
        System.out.println("==== Wierzchołek/ki z najwiekszą ilościa krawędzi: ====");
        graph.vertexesWithMostEdges();
        
        graph.bfs(3);
        
        Graph graph2 = new Graph(8);
        graph2.connect(0, 1);
        graph2.connect(0, 2);
        graph2.connect(1, 3);
        graph2.connect(1, 4);
        graph2.connect(2, 5);
        graph2.connect(2, 6);
        graph2.connect(4, 7);
        
        graph2.bfs(0);
        
        graph2.writeMatrix();
        graph2.dfs();
        
        
    }
    
}
