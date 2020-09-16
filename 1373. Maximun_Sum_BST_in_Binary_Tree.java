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
class Solution { // have been struggle with the min & max of this problem
    int max = 0;

    public int maxSumBST(TreeNode root) {
        helper(root);
        return max;
    }

    private int[] helper(TreeNode root) {
        if(root == null) return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        if(left[1] >= root.val || root.val >= right[0])
            return new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};

        int sum = root.val + left[2] + right[2];
        max = Math.max(sum, max);

        return new int[] {Math.min(root.val, left[0]), Math.max(root.val, right[1]), sum};
    }
} // memory use: 52.8 MB (64.16%), runtime: 6 ms (82.68%)
