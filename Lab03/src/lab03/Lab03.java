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
        
        graph.writeMatrix();
        graph.writeList();
        
        System.out.println("Wierzcholki z 2 sasiadami: ");
        graph.topsWithNNeighbours(2);
        System.out.println("=========================");
        System.out.println("=========================");
        graph.topsWithMostEdges();
    }
    
}
