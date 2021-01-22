class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }

        int temp = nums[0];
        int index = 1;
        int res = 1;
        
        for(int i = 1;i < len;i ++){
            if(nums[i] == temp){
                //do nothing
            } else{
                nums[index] = nums[i];
                temp = nums[i];
                index ++;
                res ++;
            }
        }
        
        return res;
    }
}