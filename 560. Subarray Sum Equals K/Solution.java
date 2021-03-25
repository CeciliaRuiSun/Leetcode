public class Solution {
    public int subarraySum(int[] nums, int k) {
        // Runtime: 1010 ms, faster than 23.48%
        // Memory Usage: 48.1 MB, less than 12.02%
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        int[] sum = new int[nums.length];
        int count = 0;
        
        for(int i = 0; i < nums.length; i ++){
            if(i == 0){
                sum[i] = nums[i];
            } else{
                sum[i] = sum[i - 1] + nums[i];
            }
            
            List<Integer> newValue = map.getOrDefault(sum[i], new ArrayList<Integer>                                      ());
            newValue.add(i);
            map.put(sum[i], newValue);
        }
        
        for(int i = 0; i < nums.length; i ++){
            int key = k - nums[i] + sum[i];
            //System.out.println("i: " + i + " key: " + key);
            if(map.containsKey(key)){
                List<Integer> value = map.get(key);
                for(int j = 0; j < value.size(); j++){
                    if(value.get(j) >= i){ 
                        count ++; 
                        //System.out.println(value.get(j));
                    }
                }
            }
            
        }
        
        
        return count;
    }
}
