class sol746 {
    class V {
        public int x;  // T(n)
        public int y;  // T(n-1)
    }
    
    public V helper (int[] cost){
        int len = cost.length;
                
        if(len == 2){
            V ret = new V();
            ret.x = Math.min(cost[0],cost[1]);
            ret.y = 0;
            return ret;
        }
        
        int beg = 0;
        int[] subarray = new int[len-1];
        System.arraycopy(cost, beg, subarray, 0, subarray.length);
        V last = helper(subarray);
        
        V res = new V();
        res.x = Math.min(last.x + cost[len-1], last.y + cost[len-2]);
        res.y = last.x;
        
        return res;
    }
    
    
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        
        if(len == 0 || len == 1){
            return 0;
        }
              
        V sol = helper(cost);
        
        return sol.x;
    }
    

}