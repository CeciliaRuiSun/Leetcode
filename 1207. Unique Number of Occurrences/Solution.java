public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Runtime: 1 ms, faster than 99.94%
        // Memory Usage: 36.7 MB, less than 89.14%
        
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int value: map.values()){
            if(mapCount.containsKey(value)){
                return false;
            } else{
                mapCount.put(value,0);
            }
        }
        
        return true;
    }
}
