class Solution1 {
    //exhaustive search
    
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = -2100000000;
        
        for(int i = 0;i < len;i++){
            int sum = nums[i];
            if(sum > max){
                max = sum;
            }
            for(int j = i + 1; j < len;j++){
                sum += nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }

        
        return max;
    }
}