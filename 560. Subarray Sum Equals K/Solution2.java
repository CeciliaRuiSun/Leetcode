class Solution2 {
    public int subarraySum(int[] nums, int k) {
        // Runtime: 19 ms, faster than 45.49% 
        // Memory Usage: 42.3 MB, less than 26.03%
        
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();  
            //key is sum, value is count of sum
        
        /* for current nums[i], find if sum[i] - k in map */
        map.put(0,1);  //needed in cases like when [1], 1
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int key = sum - k;
            count += map.getOrDefault(key,0);
        
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        
        
        return count;
    }
}
