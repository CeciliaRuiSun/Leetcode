public class Solution1 {
    //Runtime: 1 ms, faster than 98.11%
    //Memory Usage: 39.3 MB, less than 98.42%
    //Complexity: O(n) 

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        
        int max = 0;
        
        for(int i = 0;i < nums.length - 1;){
            //loop through all integers
            
            int count = 1;      //to store each stage of the number of consecutive integers
            while(nums[i + 1] > nums[i]){
                count ++;
                if(i < nums.length - 2){
                    i ++;
                } else{
                    break;
                }
            }
            
            //largest amount of consecutive integers
            if(count > max){
                max = count;
            }
            i ++;
        }
        
        return max;
    }
}
