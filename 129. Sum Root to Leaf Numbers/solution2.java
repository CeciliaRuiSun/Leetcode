// Runtime: 1 ms, faster than 23.51%
// Memory Usage: 36.7 MB, less than 41.25%

class Solution {
    public int sumNumbers(TreeNode root) {
        List<String> ls = new ArrayList<>();
        helper(root, ls, new StringBuilder());
        int ret = 0;
        for(int i = 0; i < ls.size(); i ++){
            ret += Integer.valueOf(ls.get(i).toString());
        }
        return ret;
    }
    
    private void helper(TreeNode root, List<String> ls, StringBuilder cur){
        if(root == null){
            return;
        }
        
        cur.append(root.val);
        
        if(root.left == null && root.right == null){
            StringBuilder temp = cur;
            ls.add(temp.toString());
            return;
        }
        
        if(root.left != null){
            helper(root.left, ls, cur);
            cur.deleteCharAt(cur.length() - 1);
        }
        
        if(root.right != null){
            helper(root.right, ls, cur);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
