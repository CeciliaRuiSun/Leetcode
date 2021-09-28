class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return helper(root);
    }
    
    private int helper(TreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        
        if(root.left == null && root.right != null){
            return helper(root.right) + 1;
        }
        
        if(root.right == null && root.left != null){
            return helper(root.left) + 1;
        }
        
        return Math.min(helper(root.left) + 1, helper(root.right) + 1);
    }
}
