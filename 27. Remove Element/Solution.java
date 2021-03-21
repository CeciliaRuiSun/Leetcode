class Solution {
    public int removeElement(int[] nums, int val) {
        // Runtime: 0 ms, faster than 100.00%
        // Memory Usage: 37.6 MB, less than 67.80% 
        
        int count = 0;
        int i = 0, j = nums.length - 1;
        while(i <= j){
            if(nums[i] == val){
                count ++;
                nums[i] = nums[j];
                j --;
            } else{
                i ++;
            }
        }
        return nums.length - count;
    }
}
