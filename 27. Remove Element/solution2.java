// Runtime: 1 ms, faster than 12.47%
// Memory Usage: 39.3 MB, less than 10.93%

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        
        int i = n - 1;
        int k = n - 1;
        int ret = n;
        while(i >= 0){
            if(nums[i] == val){
                nums[i] = nums[k];
                k --;
                ret --;
            }
            i --;
        }
        
        return ret;
    }
}
