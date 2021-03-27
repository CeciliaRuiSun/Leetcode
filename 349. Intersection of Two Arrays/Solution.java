public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Runtime: 2 ms, faster than 96.84% 
        // Memory Usage: 39.3 MB, less than 42.62%
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        
        for(int i: nums1){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
        }
        
        for(int j: nums2){
            if(map.containsKey(j)){
                ret.add(j);
                map.remove(j);
            }
        }
        
        int[] interv = new int[ret.size()];
        for(int i = 0; i < ret.size(); i++){
            interv[i] = ret.get(i);
        }
        
        return interv;
    }
}
