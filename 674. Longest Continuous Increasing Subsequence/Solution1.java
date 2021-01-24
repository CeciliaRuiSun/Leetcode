public class Solution1 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        
        int max = 0;
        
        for(int i = 0;i < nums.length - 1;){
            int count = 1;
            while(nums[i + 1] > nums[i]){
                count ++;
                if(i < nums.length - 2){
                    i ++;
                } else{
                    break;
                }
            }
            
            if(count > max){
                max = count;
            }
            i ++;
        }
        
        return max;
    }
}
