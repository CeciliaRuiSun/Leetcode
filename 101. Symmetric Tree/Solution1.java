class Solution1 {   
    // use recursion

    // T1 != null && T2!= null
    // T1.val = T2.val
    // S(T1.L, T2.R)
    // S(T1.R, T2.L)

    //Runtime: 0 ms, faster than 100.00%
    //Memory Usage: 39.3 MB, less than 5.08%

    public boolean isSymmetric(TreeNode root) { 
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        return helper(left,right);
    }
    
    private boolean helper(TreeNode left, TreeNode right){
        if(left != null && right != null){
            if(left.val == right.val){
                return helper(left.left, right.right) && helper(left.right, right.left);} else{
                return false;
            }
        } else if(left == null && right == null){
            return true;
        } else {
            return false;
        }
        
    }
    
}
