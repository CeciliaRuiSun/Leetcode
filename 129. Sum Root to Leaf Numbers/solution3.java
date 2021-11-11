// Runtime: 0 ms, faster than 100.00%
// Memory Usage: 36.5 MB, less than 53.88% 
 
class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    
    private int helper(TreeNode root, int curSum){
        if(root == null){
            return 0;
        }
        
        curSum = curSum * 10 + root.val;
        
        if(root.left == null && root.right == null){
            return curSum;
        }
        
        return helper(root.left, curSum) + helper(root.right, curSum);
    }
}
