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
        List<Integer> inorderList = new ArrayList<>();
        List<Integer> postorderList = new ArrayList<>();
        TreeNode ans = new TreeNode();
      
        for(int i: inorder){
            inorderList.add(i);
        }
        
        for(int j: postorder){
            postorderList.add(j);
        }
        

        return helper(inorderList, postorderList, postorderList.size() - 1);
        
    }
    
    private TreeNode helper(List<Integer> in, List<Integer> post, int root_post){
        TreeNode ans = new TreeNode();
        if(in.size() == 0){
            return null;
        }
        
        int root = post.get(root_post);
        ans.val = root;
        
        List<Integer> in_L = new ArrayList<>();
        List<Integer> in_R = new ArrayList<>();
        List<Integer> post_L = new ArrayList<>();
        List<Integer> post_R = new ArrayList<>();
        
        int root_in = in.indexOf(root);
        
        for(int i = 0; i < root_in; i++){
            in_L.add(in.get(i));
            post_L.add(post.get(i));
        }
      
        for(int i = root_in + 1; i < in.size(); i++){
            in_R.add(in.get(i));
            post_R.add(post.get(i - 1));
        }
        
        ans.left = helper(in_L, post_L, post_L.size() - 1);
        ans.right = helper(in_R, post_R, post_R.size() - 1);
        
        return ans;
    }
    
}
