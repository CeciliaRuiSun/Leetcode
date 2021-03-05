/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 1644Solution {
    List<Integer> ls1 = new ArrayList<>();
    List<Integer> ls2 = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    boolean findp = false;
    boolean findq = false;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        DFS(root,p,q);
        if(!(findp && findq)){
            return null;
        }
        int res = 0;
        int min = Math.min(ls1.size(),ls2.size());
        for(int i = 0; i < min;i ++){
            //System.out.println("i: " + i + " ls1: " + ls1.get(i) + " ls2: " + ls2.get(i));
            
            if(ls1.get(i) == ls2.get(i)){
                res = ls1.get(i);
            } else{
                break;
            }          
        }
        return new TreeNode(res);
    }
    
    private void DFS(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return;
        }
           
        cur.add(root.val);
        
        if(root.val == p.val){
            for(int i = 0; i < cur.size();i++){
                ls1.add(cur.get(i));
            }
            findp = true;
        }
        
        if(root.val == q.val){
            for(int i = 0; i < cur.size();i++){
                ls2.add(cur.get(i));
            }
            findq = true;
        }
        
        if(findp && findq){
            return;
        }

        DFS(root.left,p,q);
        
        DFS(root.right,p,q);
        
        
        cur.remove(cur.size() - 1);
    }
}