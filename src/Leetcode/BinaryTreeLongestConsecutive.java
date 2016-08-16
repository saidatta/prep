package Leetcode;

/**
 * Created by vmunnangi on 8/12/16.
 */
public class BinaryTreeLongestConsecutive {
    public int longestConsecutive(TreeNode root) {
        int max = 0;
        helperMethod(root, max);
        return max;
    }

    public int helperMethod(TreeNode node, int max) {
        if(node == null) {
            return 0;
        }
        int leftSize = helperMethod(node.left, max);
        int rightSize = helperMethod(node.right, max);

        int tempL;
        int tempR;

        if(node.left  == null) {
            tempL = 1;
        } else if(node.left.val - node.val == 1) {
            tempL = leftSize + 1;
        } else {
            tempL = 1;
        }

        if(node.right  == null) {
            tempR = 1;
        } else if(node.right.val - node.val == 1) {
            tempR = rightSize + 1;
        } else {
            tempR = 1;
        }

        max = Math.max(max, tempL);
        max = Math.max(max, tempR);

        return max;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
