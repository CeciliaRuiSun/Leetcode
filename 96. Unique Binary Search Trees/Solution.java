class Solution {
    Map<Integer,Integer> map = new HashMap<>();
        
    public int numTrees(int n) {
        if(n <= 1){
            return 1;
        }
        int ret = 0;
        for(int i = 0; i < n; i++){
            
            int L = 0, R = 0;
            if(map.containsKey(i)){
               L = map.get(i);
            } else{
                L = numTrees(i);
            }
            
            if(map.containsKey(n - 1 - i)){
                R = map.get(n - 1 - i);
            } else{
                R = numTrees(n - 1 - i);
            }
            
            ret += L * R;
            
        }
        map.put(n, ret);
        return ret;
    }
}