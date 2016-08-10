package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vmunnangi on 8/6/16.
 */
public class NumberOfIslands {
    static int X_MAX = 0;
    static int Y_MAX = 0;

    public static void main(String [] args) {

    }

    public static int numOfIslands(char [][] grid) {
        int X_MAX = grid.length;
        if(X_MAX == 0) {
            return 0;
        }
        int Y_MAX = grid[0].length;

        boolean [][] visited = new boolean[X_MAX][Y_MAX];
        int ans = 0;

                for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<Y_MAX;j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i,j, visited);
                    ans += 1;
                }
            }
        }
        return ans;
    }

    public static void dfs(char[][] grid, int i, int j, boolean[][] visited){
        visited[i][j] = true;
        if(i+1 < X_MAX && grid[i+1][j] == '1' && !visited[i+1][j]) {
            dfs(grid, i+1,j,visited);
        }
        if(i -1 >= 0 && grid[i-1][j] == '1' && !visited[i-1][j]) {
            dfs(grid, i-1,j,visited);
        }
        if(j -1 >= 0 && grid[i][j-1] == '1' && !visited[i][j-1]) {
            dfs(grid, i,j-1,visited);
        }
        if(j+1 >= 0 && grid[i][j+1] == '1' && !visited[i][j+1]) {
            dfs(grid, i,j+1,visited);
        }
    }

}
