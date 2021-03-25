public class Solution2 {
    // hashmap
    // Runtime: 3 ms, faster than 23.78% 
    // Memory Usage: 39.1 MB, less than 66.55%

    public int[] twoSum(int[] nums, int target) {       
        Map<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            } else{
                ret[0] = map.get(target - nums[i]);
                ret[1] = i;
            }
        }
        
        
        return ret;
    }
}
