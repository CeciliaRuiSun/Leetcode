public class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        // Runtime: 42 ms, faster than 65.81% 
        // Memory Usage: 39.3 MB, less than 26.50%
        
        Map<Long, Integer> hm1 = new HashMap<>();
        Map<Long, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            long key = (long)nums1[i] * nums1[i];
            if(!hm1.containsKey(key)){
                hm1.put(key, 1);
            } else{
                hm1.put(key, hm1.get(key) + 1);
            }
        }
        
        
        /*
        
        for(int n:nums1){
            hm1.put(n, hm1.getOrDefault(n, 0) + 1);
        }
        
        */
    
        for(int j = 0; j < nums2.length; j++){
            long key2 = (long)nums2[j] * nums2[j];
            if(!hm2.containsKey(key2)){
                hm2.put(key2, 1);
            } else{
                hm2.put(key2, hm2.get(key2) + 1);
            }
        }
        
        int count = 0;
        for(int i = 0; i < nums1.length - 1; i++){
            for(int j = i + 1; j < nums1.length; j++){
                if(hm2.containsKey((long)nums1[i] * nums1[j])){
                    count = count + hm2.get((long)nums1[i] * nums1[j]);
                }
            }
        }
        
        for(int i = 0; i< nums2.length - 1; i++){
            for(int j = i + 1; j < nums2.length; j++){
                if(hm1.containsKey((long)nums2[i] * nums2[j])){
                    count = count + hm1.get((long)nums2[i] * nums2[j]);
                }
            }
        }
        
        
        return count;
    }
}
