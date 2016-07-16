import java.util.ArrayList;
import java.util.List;

/**
 * This is a basic atomic element of a graph that will contain all the data.
 * Created by vmunnangi on 1/18/16.
 */
public class Node {
    private char label;
    private int pathCost;
    private List<Edge> edgeList = new ArrayList<>();
    private Edge minCostEdge;

    public Node(char label) {
        this.label = label;
        this.pathCost = Integer.MAX_VALUE;
        minCostEdge = null;
    }

    public Node(char label, int cost) {
        this(label);
        pathCost = cost;
    }

    public Node(char label, int cost, Edge e) {
        this(label, cost);
        edgeList.add(e);
    }

    public String toString() {
        String out = "Node " + label +" Cost: " + pathCost + "\n";
        for (Edge e : edgeList)
            out = out + e.toString() + "\n";
        return out;
    }

    public String showCost() {
        return label+" "+pathCost;
    }

    public void setCost(int newCost) {
        this.pathCost = newCost;
    }

    public void setMinEdge(Edge e) {
        minCostEdge = e;
    }

    public void addEdge(Edge e) {
        edgeList.add(e);
    }


    public char getLabel() { return label; }
    public int getCost() { return pathCost; }
    public List<Edge> getEdges() { return edgeList; }
}
