package lab03;

/**
 *
 * @author bielinskim
 */
public class Vertex {
    
    public boolean visited;
    public int distance;
    public Vertex parent;

    public Vertex(boolean visited, int distance, Vertex parent) {
        this.visited = false;
        this.distance = 0;
        this.parent = null;
        
    }

    public boolean isVisited() {
        return visited;
    }

    public int getDistance() {
        return distance;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }
    
    
}
