public class 986IntervalListIntersections {
    // Runtime: 2 ms, faster than 99.60% 
    // Memory Usage: 39.9 MB, less than 72.48%

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ret = new ArrayList();
        int len_f = firstList.length;
        int len_s = secondList.length;
        
        int i = 0;
        int j = 0;
        
        while(i < len_f && j<len_s){
            int a = firstList[i][0];
            int b = firstList[i][1];
            int c = secondList[j][0];
            int d = secondList[j][1];
             
            if (a >= c && b <= d){      
                ret.add(new int[]{a, b});
                i ++;
            } else if(a <= c && d <= b){
                ret.add(new int[]{c, d});
                j ++;
            } else if(a <= c && c <= b && b<= d){
                ret.add(new int[]{c, b});
                i ++;
            } else if(c <= a && a<= d && d<= b){
                ret.add(new int[]{a, d});
                j ++;
            } else if(a >= d){
                j++;
            } else if(b <= c){
                i++;
            }
                              
        }
        
        return ret.toArray(new int[ret.size()][]);
    }
    
}
