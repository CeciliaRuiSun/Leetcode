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
    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 39.2 MB, less than 60.07%
    
    List<List<Integer>> ret = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {        
        if(root == null){
            return ret;
        }
        
        List<TreeNode> first = new ArrayList<>();
        first.add(root);
        helper(first);
        
        return ret;
    }
    
    private void helper(List<TreeNode> ls){
        if(ls.size() == 0){
            return;
        }
        List<Integer> curLevel = new ArrayList<>();
        List<TreeNode> nextLevel = new ArrayList<>();
       
        for(TreeNode node: ls){
            curLevel.add(node.val);
            if(node.left != null){
                nextLevel.add(node.left);
            }
            if(node.right != null){
                nextLevel.add(node.right);
            }
        }
        
        ret.add(curLevel);
        helper(nextLevel);
        
        return;
    }
}