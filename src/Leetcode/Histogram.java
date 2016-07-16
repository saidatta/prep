package Leetcode;

import java.util.*;
/**
 * Created by vmunnangi on 6/27/16.
 */
public class Histogram {

    public static void main(String [] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,2}));
    }

    public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        Stack<Integer> temp = new Stack<Integer>();

        int max = 0;
        int i = 0;

        while (i < height.length) {
            //push index to stack when the current height is larger than the previous one
            if (temp.isEmpty() || height[i] >= height[temp.peek()]) {
                temp.push(i);
                i++;
            } else {
                //calculate max value when the current height is less than the previous one
                int p = temp.pop();
                int h = height[p];
                int w = temp.isEmpty() ? i : i - temp.peek() - 1;
                max = Math.max(h * w, max);
            }

        }

        while (!temp.isEmpty()) {
            int p = temp.pop();
            int h = height[p];
            int w = temp.isEmpty() ? i : i - temp.peek() - 1;
            max = Math.max(h * w, max);
        }

        return max;
    }
}
