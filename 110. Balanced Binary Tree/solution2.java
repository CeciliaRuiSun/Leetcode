//  https://leetcode.com/problems/balanced-binary-tree/discuss/437267/Java-simpler-and-better-bottom-up-solution-O(n)
//  Time: O(n)
//  We use DFS to scan the tree one time.

class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }
    
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = helper(root.left);
        int right = helper(root.right);
        
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }
        
        return Math.max(left, right) + 1;
    }
}
