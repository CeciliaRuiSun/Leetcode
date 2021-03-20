public class 1229Solution2 {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) { 
        // Runtime: 48 ms, faster than 12.98%
        // Memory Usage: 70.3 MB, less than 7.66%
        Arrays.sort(slots1,(a,b) -> a[0] - b[0]);
        Arrays.sort(slots2,(a,b) -> a[0] - b[0]);

        List<Integer> ret = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i < slots1.length && j < slots2.length){
            //System.out.println("a :" + a + " b: " + b + " c: " + c + " d: "+d);
            int int_left = Math.max(slots1[i][0],slots2[j][0]);
            int int_right = Math.min(slots1[i][1],slots2[j][1]);
            if(int_right - int_left >= duration){
                ret.add(int_left);
                ret.add(int_left + duration);
                break;
            } else if(slots1[i][1] > slots2[j][1]){
                j ++;
            } else{
                i ++;
            }
        }
        
        return ret;
    }
}
