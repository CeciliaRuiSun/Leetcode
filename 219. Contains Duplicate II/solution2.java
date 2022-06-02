class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0) return false;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!set.isEmpty() && set.contains(nums[i])) return true;
            
            if(i < k){
                set.add(nums[i]);
                continue;
            }
            
            set.add(nums[i]);
            set.remove(nums[i - k]);
        }
        
        return false;
    }
}



class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i - k - 1]);
            }
            
            if(set.contains(nums[i])){ 
                return true;
            }
            
            set.add(nums[i]);
        }
        
        return false;
    }
}
