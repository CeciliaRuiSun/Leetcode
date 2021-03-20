class Solution {
    // Runtime: 1 ms, faster than 98.83%
    // Memory Usage: 41.5 MB, less than 43.47%
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ret = new ArrayList();
        int len = intervals.length;
        
        int c = newInterval[0];
        int d = newInterval[1];
        boolean find = false;
        
        int i = 0;
        while(i < len){
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(d < a){
                ret.add(newInterval);
                find = true;
                i --;
                break;
            }
            
            if(c <= a && a <= d || a <= c && c <= b){
                ret.add(new int[]{Math.min(a,c), Math.max(b,d)});
                find = true;
                break;
            } 
            else{
                ret.add(intervals[i]);
            }
            i ++;
        }
        
        if(!find){
            ret.add(newInterval);
        } else if(i < len - 1){
            while(i < len - 1){
                i ++;
                //System.out.println("ret : " + ret.get(ret.size() - 1)[1]);
                //System.out.println(intervals[i][0]);
                //System.out.println(intervals[i][1]);
                if(ret.get(ret.size() - 1)[1] >= intervals[i][1]){

                } else if(ret.get(ret.size() - 1)[1] < intervals[i][0]){
                    ret.add(intervals[i]);
                } else{
                    ret.get(ret.size() - 1)[1] = intervals[i][1];
                }
            }
        }
        
        return ret.toArray(new int[ret.size()][]);
    }
}