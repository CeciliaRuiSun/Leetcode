public class 452MinNumofArrowtoBurstBalloon {
    public int findMinArrowShots(int[][] points) {
        // Runtime: 17 ms, faster than 42.48% 
        // Memory Usage: 46.5 MB, less than 79.56%
        
        Arrays.sort(points,(a,b) -> Double.compare(a[0],b[0]));
        int count = 1;
        int len = points.length;
        if(len == 0){
            return 0;
        }
        //int a = points[0][0];
        int b = points[0][1];
        int end = b;
        int i = 1;
        while(i < len){
            int c = points[i][0];
            int d = points[i][1];
            if(end < c){
                count ++;
                b = d;
                end = d;
            } else{
                end = Math.min(end,d);
            }
            i ++;
        }
        
        return count;
    }
}
