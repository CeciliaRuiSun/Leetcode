class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return helper(root);
    }
    
    private int helper(TreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        
        if(root.left == null && root.right != null){
            return helper(root.right) + 1;
        }
        
        if(root.right == null && root.left != null){
            return helper(root.left) + 1;
        }
        
        return Math.min(helper(root.left) + 1, helper(root.right) + 1);
    }
}


// BFS
// Runtime: 2 ms, faster than 79.68% 
// Memory Usage: 92.4 MB, less than 36.31%

class Solution {
    
    public int minDepth(TreeNode root) {
        int ret = 0;
        if(root == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(true){
            ret ++;
            int size = queue.size();
            for(int i = 0; i < size; i ++){
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right == null){
                    return ret;
                }
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        
    }
    
}
