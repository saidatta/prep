package Leetcode;

/**
 * Created by vmunnangi on 8/11/16.
 */
public class NumMatrix {

    int [] [] matrix ;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void update(int row, int col, int val) {
        this.matrix[row][col] = val;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = 0;
        for(int i = row1; i <= row2; i ++) {
            for(int j = col1; j <= col2; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;

    }
}
