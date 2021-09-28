class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        
        return helper(root, targetSum);
    }
    
    private boolean helper(TreeNode root, int targetSum){
        if(root.left == null && root.right == null && root.val == targetSum){
            return true;
        } else if(root.left == null && root.right == null && root.val != targetSum){
            return false;
        }
        
        if(root.left == null){
            return helper(root.right, targetSum - root.val);
        }
        
        if(root.right == null){
            return helper(root.left, targetSum - root.val);
        }
        
        return helper(root.left, targetSum - root.val) || helper(root.right, targetSum - root.val);
    }
}
