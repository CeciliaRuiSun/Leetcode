class 435Solution {
    // Runtime: 1 ms, faster than 100.00% 
    // Memory Usage: 38.9 MB, less than 75.22%

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Double.compare(a[0],b[0]));
        int count = 0;
        //int a = intervals[0][0];
        if(intervals.length == 0){
            return count;
        }
        int b = intervals[0][1];
        int i = 1;
        while(i < intervals.length){
            int c = intervals[i][0];
            int d = intervals[i][1];
            if(b <= c){
                // no overlapping               
               // a = c;
                b = d;
                
            } else{
                count++;
                b = Math.min(b,d);                
            }
            i++;
        }
                
        return count;
    }
}
