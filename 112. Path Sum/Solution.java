class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {        
        if(root == null){
            return false;
        }
        
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }       
        
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}
