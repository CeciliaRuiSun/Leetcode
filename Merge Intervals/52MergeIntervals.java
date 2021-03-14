class 52MergeIntervals {
    // Runtime: 5 ms, faster than 94.78%
    // Memory Usage: 41.4 MB, less than 92.58% 

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        int len = intervals.length;
        int[][] ret = new int[len][2];
        ret[0] = intervals[0];
        int size = 0;
        
        int i = 1;
        while(i < len){
            if(ret[size][1] < intervals[i][0]){
                ret[size + 1] = intervals[i];
                size ++;
            } else{
                ret[size][1] = Math.max(ret[size][1],intervals[i][1]);
            }
            i ++;
        }
        
        int[][] copy = new int[size + 1][2];
        System.arraycopy(ret,0,copy,0,size + 1);
        return copy;
    }
}