/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 1644Solution2 {
    // Runtime: 8 ms, faster than 39.29%
    // Memory Usage: 42.3 MB,less than 36.19%
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Ret result = LCA(root, p, q);
        if(!result.find_lca){
            return null;
        }
        return new TreeNode(result.lca);
    }
    

    private Ret LCA(TreeNode root, TreeNode p, TreeNode q){
        Ret result = new Ret();
        if(root == null){
            return result;
        }
        
        // root = p
        if(root.val == p.val){  
            result.findp = true;
            if(LCA(root.left, p, q).findq || LCA(root.right, p, q).findq){
                result.lca = root.val;
                result.find_lca = true;
                result.findq = true;
            }
            //result.Print(root.val);
            //System.out.print("P");
            return result;
        }
        
        // root = q
        if(root.val == q.val){
            result.findq = true;
            if(LCA(root.left, p, q).findp || LCA(root.right, p, q).findp){
                result.lca = root.val;
                result.find_lca = true;
                result.findp = true;
            }
            //result.Print(root.val);
            return result;
        }
        
        // root != p && root != q
        Ret L = LCA(root.left, p, q);
        if(L.find_lca){
            result.lca = L.lca;
            result.find_lca = true;
            result.findp = true;
            result.findq = true;
            //result.Print(root.val);
            return result;
        }
        
        Ret R = LCA(root.right, p, q);
        if(R.find_lca){
            result.lca = R.lca;
            result.find_lca = true;
            result.findp = true;
            result.findq = true;
            //result.Print(root.val);
            return result;
        }
        
        if(L.findp && R.findq || (L.findq && R.findp)){
            result.lca = root.val;
            result.find_lca = true;
            result.findp = true;
            result.findq = true;
            //result.Print(root.val);
            return result;
        }
        
        if(!L.find_lca && !R.find_lca){
            result.findp = L.findp || R.findp;
            result.findq = L.findq || R.findq;
            //result.Print(root.val);
            return result;
        }  
        return result;
    }
    
    public class Ret{
        int lca;
        boolean find_lca = false;
        boolean findp = false;
        boolean findq = false;
        
        public Ret(){
            
        }
        public void Print(int root) {
            System.out.println("root: "+ root +", lca: "+lca+", find_lca: " + find_lca + ", find_p: "+findp + ", find_q: "+findq);
        }
    }
    
}