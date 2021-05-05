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
class Solution1 {
    // recursion, top - down
    // time: O(nlogn)

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        if(Math.abs(helper(root.left) - helper(root.right)) > 1){
            return false;
        }
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        return Math.max(1 + helper(root.left), 1 + helper(root.right));
    }
}
