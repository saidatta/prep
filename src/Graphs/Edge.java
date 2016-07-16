/**
 * This class is meant for directed graphs's link between a pair of nodes
 * Created by vmunnangi on 1/18/16.
 */
public class Edge {
    private Node from;
    private Node to;
    private int cost;

    public Edge(Node from, Node to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    public int getCost() {
        return cost;
    }

    public void setFrom(Node from) {
        this.from = from;
    }

    public void setTo(Node to) {
        this.to = to;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
