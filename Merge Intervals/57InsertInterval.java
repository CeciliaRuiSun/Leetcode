class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ret = new ArrayList();
        int size = intervals.length;
        
        if(size == 0){
            ret.add(newInterval);
            return ret.toArray(new int[ret.size()][]);
        }
        
        int i = 0;
        int a = newInterval[0];
        int b = newInterval[1];
        while(i < size){
            if(intervals[i][1] < a){
                ret.add(intervals[i]);
                i++;
                continue;
            } else{
                ret.add(new int[]{0,0});
                //System.out.println(Arrays.toString(ret.get(ret.size()-1)));
                ret.get(ret.size()-1)[0] = intervals[i][0];
                i++;
                while(i < size && intervals[i][0] < b){
                    i++;
                }
                
                if(i >= size){
                    ret.get(ret.size()-1)[1] = Math.max(b, intervals[i-1][1]);
                } else if(intervals[i][0] == b){
                    ret.get(ret.size()-1)[1] = intervals[i][1];
                    i++;
                } else if(intervals[i][0] > b){
                    ret.get(ret.size()-1)[1] = b;
                }
                break;
            }            
        }
        
        for(int j = i; j < size; j++){
         ret.add(intervals[j]);
        }
        
        return ret.toArray(new int[ret.size()][]);
    }
}