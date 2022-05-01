// Runtime: 0 ms, faster than 100.00%
// Memory Usage: 40.6 MB, less than 92.38%
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = -1, j = 0;
        while(j < nums.length){
            if(nums[j] != val){
                nums[i + 1] = nums[j];
                i ++;
            }
            j ++;
        }
        
        return i + 1;
    }
}
