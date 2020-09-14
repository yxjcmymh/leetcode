/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        int sol[] = helper(root);
        return Math.max(sol[0], sol[1]);
    }

    private int[] helper(TreeNode root) {
        if(root == null) return new int[] {0, 0};

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int childMax = left[0] + right[0];

        return new int[] {Math.max(childMax, root.val+left[1]+right[1]), childMax};
    }
} // memory use: 39.3 MB (58.33%), runtime: 0 ms (100%)
