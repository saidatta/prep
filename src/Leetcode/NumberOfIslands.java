package Leetcode;

import java.util.ArrayList;

/**
 * Created by vmunnangi on 8/6/16.
 */
public class NumberOfIslands {

    int X_MAX = 0;
    int Y_MAX = 0;
    public int numIslands(char[][] grid) {

        return -1;
    }


    public class Point {
        int x;
        int y;
        boolean visited;
        boolean isLand;
    }

    public class Solution {
        public static void main(String [] args) {
            NumberOfIslands islands = new NumberOfIslands();

        }
    }

    ArrayList<Point> findNeighbours(Point p) {
        Point right = new Point();
        right.x = p.x +1;
        right.y = p.y;

        Point left = new Point();
        left.x =  p.x -1;
        left.y = p.y;

        Point bottom = new Point();
        bottom.x = p.x;
        bottom.y = p.y +1;

        Point top = new Point();
        top.x = p.x;
        top.y = p.y -1;

        ArrayList<Point> ans = new ArrayList<>();
        ans.add(right);
        ans.add(left);
        ans.add(bottom);
        ans.add(top);

        return ans;
    }


    /**
     *         if(right.x < X_MAX && right.y < Y_MAX) {
     ans.add(right);
     }
     if(left.x < X_MAX && left.y < Y_MAX) {
     ans.add(left);
     }
     if(bottom.x < X_MAX && bottom.y < Y_MAX) {
     ans.add(bottom);
     }
     if(top.x < X_MAX && top.y < Y_MAX) {
     ans.add(top);
     }

     * @param adjacency_matrix
     * @param p
     */

    public  int dfs(int islands[][], Point p) {
        X_MAX = islands.length;
        Y_MAX = islands[0].length;

        ArrayList<Point> neighbours= findNeighbours(p);
        boolean isIsland = true;
        for (int i = 0; i < neighbours.size(); i++) {
            Point n=neighbours.get(i);
            if(n ==null) {
                continue;
            }
            if(n.isLand) {
                dfs(islands,n);
                n.visited=true;
                n.isLand = (islands[n.x][n.y] == 1);
                isIsland = !n.isLand;
            }
        }
        return (isIsland) ? 1 : 0;
    }
}
