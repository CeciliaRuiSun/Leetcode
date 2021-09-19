// use DP
// Runtime: 1 ms, faster than 57.62%
// Memory Usage: 41.2 MB, less than 31.22%

class Solution {
    public int maxSubArray(int[] nums) {
        int ret = nums[0];
        int sum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            if(sum > ret){
                ret = sum;
            }
        }
        
        return ret;
    }
}
