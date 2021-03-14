class 252MeetingRoom {
    // Runtime: 4 ms, faster than 96.71% 
    // Memory Usage: 38.8 MB, less than 73.07%
    
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        
        if(intervals.length == 0 || intervals.length == 1){
            return true;
        }
        
        for(int i = 0; i < intervals.length - 1; i ++){
            if(intervals[i][1] > intervals[i + 1][0]){
                return false;
            }
        }
        
        return true;
    }
}