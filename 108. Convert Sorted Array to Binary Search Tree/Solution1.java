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
class Solution1 {
    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 38.6 MB, less than 66.36%
    public TreeNode sortedArrayToBST(int[] nums) {

        int len = nums.length;
        int mid = len/2;
        if(len == 0){
            return null;
        }
        if(len == 1){
            return new TreeNode(nums[0]);
        }
        //System.out.println("mid:" + nums[mid]);

        TreeNode ret = new TreeNode(nums[mid]);
        int[] nums_L = new int[mid];
        System.arraycopy(nums,0,nums_L,0,mid);
        ret.left = sortedArrayToBST(nums_L);
        
        int[] nums_R = new int[len - mid - 1];
        System.arraycopy(nums,mid+1,nums_R,0,len - mid - 1);
        ret.right = sortedArrayToBST(nums_R); 
        //System.out.println(" ===== Exit ===== ");

        //System.out.println(Arrays.toString(nums));

        //System.out.println("tree: "+ret + " L: "+ret.left+" R: "+ret.right);
        //System.out.println(" ---- Exit ---- ");

        return ret;
    } 
    
}