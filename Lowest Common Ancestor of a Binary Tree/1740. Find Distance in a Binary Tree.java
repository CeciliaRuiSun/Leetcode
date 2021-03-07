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
    // Runtime: 8 ms, faster than 19.96%
    // Memory Usage: 52.1 MB, less than 8.18%

    List<Integer> cur = new ArrayList<>();
    List<Integer> ls1 = new ArrayList<>();
    List<Integer> ls2 = new ArrayList<>();
    
    public int findDistance(TreeNode root, int p, int q) {
        LCA(root, p, q);
        int ind_lca = 0;
        for(int i = 0;i < Math.min(ls1.size(), ls2.size()); i ++){
            if(ls1.get(i).equals(ls2.get(i))){
                ind_lca = i + 1;
            } else{
                break;
            }
        }
        
        return ls1.size() + ls2.size() - 2*ind_lca;
    }
    
    private void LCA(TreeNode root, int p, int q){
        if(root == null){
            return;
        }
        
        cur.add(root.val);
        
        if(root.val == p){
            ls1 = copyList(cur, ls1);
        }
        
        if(root.val == q){
            ls2 = copyList(cur, ls2);
        }
        
        LCA(root.left, p, q);
        LCA(root.right, p, q);
        cur.remove(cur.size() - 1);        
    }
    
    private List<Integer> copyList(List<Integer> path, List<Integer> ls){
        for(int i = 0;i < path.size();i++){
            ls.add(path.get(i));
        }
        return ls;
    }
}