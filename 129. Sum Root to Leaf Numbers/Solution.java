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
    // Runtime: 1 ms, faster than 25.29%
    // Memory Usage: 36.7 MB, less than 30.96% 
    
    private int sum = 0;
    
    public int sumNumbers(TreeNode root) {        
        helper(root, "");

        return sum;
    }
    
    private void helper(TreeNode root, String cur){
        if(root == null){
            return;
        }
        
        cur += Integer.toString(root.val);
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(cur);
            return;
        }
        
        helper(root.left, cur);
        helper(root.right, cur);
        
    }
}