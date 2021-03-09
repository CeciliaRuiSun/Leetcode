class Solution1 {
    // Runtime: 7 ms, faster than 45.61%
    // Memory Usage: 38.7 MB, less than 86.18%

    public int minMeetingRooms(int[][] intervals) {
        int count = 0;
        List<Integer> rooms = new ArrayList<>();      
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        rooms.add(intervals[0][1]);
        count ++;
        
        for(int i = 1;i < intervals.length;i ++){
            boolean findRoom = false;
            for(int j = 0;j < rooms.size();j ++){
                if(rooms.get(j) <= intervals[i][0]){
                    rooms.set(j, intervals[i][1]);
                    findRoom = true;
                    break;
                }
            }
            
            if(findRoom == false){
                rooms.add(intervals[i][1]);
                count ++;
                
            }
        }
        
        
        return count;
    }
}
