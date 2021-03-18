public class 1288RemoveCoveredInterval {
    public int removeCoveredIntervals(int[][] intervals) {
        // Runtime: 5 ms, faster than 61.64% 
        // Memory Usage: 39.3 MB, less than 74.78% 
        
        Arrays.sort(intervals,(a,b) -> Double.compare(a[0],b[0]));
        int count = 0;
        int len = intervals.length;
        int a = intervals[0][0];
        int b = intervals[0][1];
        int i = 1;
        while(i < len){            
            int c = intervals[i][0];
            int d = intervals[i][1];
            
            if(a <= c && d <= b){
                // ith covers (i+1)th
                count++;
            } else if(a == c && b <= d){
                // (i+i)th covers ith
                count++;
                a = c;
                b = d;
            } else {
                // no cover
                a = c;
                b = d;
            }
            i++;
        }
        
        return (len - count);
    }
}
