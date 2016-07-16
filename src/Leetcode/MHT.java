package Leetcode;

import java.util.*;

/**
 * Created by vmunnangi on 6/22/16.
 */
public class MHT {
    List<Integer> result = new ArrayList<>();
    Set<Integer> allNodes = new HashSet<>();

    public static void main (String [] args) {
        //n = 4, edges = [[1, 0], [1, 2], [1, 3]]
        int [] [] edges = {{1, 0}, {1, 2}, {1, 3}};
        findMinHeightTrees(4, edges);
    }

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Graph g = new Graph(n, edges);
        Set<Integer> aa = g.getNodes();
        HashMap<Integer, List<Integer>> axa = new HashMap<>();
        List<Integer> nnn = new ArrayList<>();
        for(int x : aa) {
            nnn.add(bfs(n, x,g, 0));
        }

        for(int i : nnn) {
            System.out.println(i);
        }
        return nnn;
    }


    public static int bfs (int n, int d, Graph g, int count) {
        Queue q = new LinkedList<>();
        boolean visited[] = new boolean[n];
        q.add(d);
        visited[d] = true;
        while (!q.isEmpty()) {
            int temp = (Integer) q.remove();
            int [] adjss = g.adjacentTo(temp);
            for (int i = 0 ;i<adjss.length;i++ ) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    count++;

                }
            }
        }
        return count;
    }

     static class Node{
        int data;
         boolean visited = false;
         Node(int d) {
             this.data = d;
         }
        int getData() {
            return data;
        }

        void setData(int d) {
            this.data = d;
        }
    }

    static class Graph {
        private boolean[][] adj = new boolean[4][4];
        private Set<Integer> nodes;

        Graph(int x) {
            this.adj = new boolean[x][x];
        }

        Graph (int numOfNodes, int [][] edges) {
                nodes = new HashSet<>();
                for (int[] edge : edges) {
                for (int j = 0; j < 2; j++) {
                    if (edge[0] > edge[1]) {
                        adj[edge[1]][edge[0]] = true;
                    } else {
                        adj[edge[0]][edge[1]] = true;
                    }
                    nodes.add(edge[0]);
                    nodes.add(edge[1]);
                }
            }
        }

        int [] adjacentTo(int d) {
            boolean [] arr = this.adj[d];
            int [] adjs = new int[arr.length];
            int x = 0;
            for(int i = 0; i < arr.length;i++) {
                if(arr[i]) {
                    adjs[x++] = i;
                }
            }
            return adjs;
        }

        Set<Integer> getNodes() {
            Set<Integer> assa = new HashSet<Integer>();
            for(int node : nodes) {
                assa.add(node);
            }
            return assa;
        }
    }
}
