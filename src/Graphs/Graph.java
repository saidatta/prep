import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Based on assumptions in the question, we assume nodes are labeled A-Z (max 26).
 * Nodes and edges of the graph are stored in arrays.
 */

public class Graph {
    public static final int MAX_NODES = 26;
    private Node[] nodes = new Node[MAX_NODES];
    private Edge[] edges = new Edge[MAX_NODES * MAX_NODES];
    private int numberEdges = 0;
    private Scanner input;

    public Graph(String fileName) {

        try {
            input = new Scanner(new FileInputStream(fileName));
        } catch (Exception e) {
            System.err.println(e);
            return;
        }

        // Assume valid input file.
        while ( input.hasNext() ) {
            char from, to;
            int cost;

            from = input.next().charAt(0);
            to = input.next().charAt(0);
            cost = input.nextInt();

            int fromIndex = from - 'A';
            int toIndex = to - 'A';

            // Create nodes if label is new; no checking for now.
            if ( nodes[fromIndex] == null )
                nodes[fromIndex] = new Node(from);

            if ( nodes[toIndex] == null )
                nodes[toIndex] = new Node(to);

            // Create edge, add edge to list of edges for the "from" node.
            edges[numberEdges] = new Edge( nodes[fromIndex], nodes[toIndex], cost);
            nodes[fromIndex].addEdge(edges[numberEdges]);
            numberEdges++;
        }
    }


    // Outputs a .dot file as a String
    public String toString() {
        String s = "digraph g {\n";
        for (int i = 0; i < numberEdges; i++)
            s = s + edges[i].toString() + "\n";
        s = s + ("}");
        return s;
    }

    // Returns path costs for nodes as a String
    public String showPathCosts() {
        String s = "";
        for ( Node node : nodes )
            if ( node != null )
                s += node.showCost() + "\n";
        return s;
    }

    public Node[] getNodes() { return nodes; }

    /**
     * A main program to read a graph file and produce .dot output,
     * and additional information.
     *
     * NOTE that node costs will be the maximum integer value for
     * this test program (see constructor).
     *
     * @param    args      input file.
     */

    public static void main(String args[]) {
        if ( args.length < 1 ) {
            System.out.println("Usage: java Graph <filename>");
            return;
        }

        Graph g = new Graph(args[0]);
        System.out.println(g);

        System.out.println("\n\nNodes:");
        Node[] nodes = g.getNodes();
        for (Node node : nodes)
            if (node != null)
                System.out.println(node);

        System.out.println("\n\nCosts:");
        System.out.println(g.showPathCosts());
    }
}
