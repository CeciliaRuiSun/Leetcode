  
    // use recursion

    // T1 != null && T2!= null
    // T1.val = T2.val
    // S(T1.L, T2.R)
    // S(T1.R, T2.L)

    //Runtime: 0 ms, faster than 100.00%
    //Memory Usage: 39.3 MB, less than 5.08%

 class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }
    
    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        } else if(left == null || right == null || left.val != right.val){
            return false;
        } else {
            return helper(left.left, right.right) && helper(left.right, right.left);
        }
    }
}



// v2
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return helper(root.left, root.right);
    }
    
    private boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        
        if(left.val != right.val){
            return false;
        }
        
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
