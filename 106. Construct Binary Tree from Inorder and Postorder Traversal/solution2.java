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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < inorder.length; i ++){
            map.put(inorder[i], i);
        }
        
        return helper(inorder, postorder, postorder.length - 1, 0, inorder.length -1, map);
    }
    
    private TreeNode helper(int[] inorder, 
                            int[] postorder,
                            int postEnd,
                            int inStart,
                            int inEnd,
                            Map<Integer, Integer> map){
        if(postEnd < 0 || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        
        int rootIndex = map.get(postorder[postEnd]);
        root.left = helper(inorder, postorder, postEnd - (inEnd - rootIndex) - 1, inStart, rootIndex - 1, map);
        root.right = helper(inorder, postorder, postEnd - 1, rootIndex + 1, inEnd, map);
        
        return root;
    }
}





