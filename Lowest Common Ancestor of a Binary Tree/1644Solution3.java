public class 1644Solution3 {
    // Author: prashantharshi
    // Runtime: 6 ms, faster than 100.00% 
    // Memory Usage: 41.9 MB, less than 75.47%

    private TreeNode lcaNode = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs_util(root, p.val, q.val);
        return lcaNode;
    }

    private TreeNode dfs_util(TreeNode node, int num1, int num2) {
        if(node == null)return null;
        if(node.val == num1){
            if(isPresentInsubtree(node, num2))
                 lcaNode = node;
            return node;
        }
        if(node.val == num2){
            if(isPresentInsubtree(node, num1))
                lcaNode = node;
            return node;
        }

        // node != p && node != q
        TreeNode left = dfs_util(node.left, num1, num2);
        TreeNode right = dfs_util(node.right, num1, num2);
        // node is lca 
        if(left != null && right != null){
            lcaNode = node;
            return node;
        }
        if(left != null && right == null) return left;
        if(left == null && right != null) return right;
        return null;
    }

    private boolean isPresentInsubtree(TreeNode node, int val){
        if(node == null) return false;
        if(node.val == val) return true;
        return isPresentInsubtree(node.left, val) || isPresentInsubtree(node.right, val);
    }
}
