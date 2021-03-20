public class 1229MeetingScheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) { 
        // Runtime: 47 ms, faster than 13.71%
        // Memory Usage: 70.3 MB, less than 7.66%
        Arrays.sort(slots1,(a,b) -> Double.compare(a[0],b[0]));
        Arrays.sort(slots2,(a,b) -> Double.compare(a[0],b[0]));
        int a = slots1[0][0];
        int b = slots1[0][1];
        int c = slots2[0][0];
        int d = slots2[0][1];
        List<Integer> ret = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i < slots1.length && j < slots2.length){
            //System.out.println("a :" + a + " b: " + b + " c: " + c + " d: "+d);
            if(c <= b && b <= d){
                if(Math.min(b - a, b - c) >= duration){
                    ret.add(Math.max(a,c));
                    ret.add(ret.get(0) + duration);
                    break;
                } else{
                    i ++;
                    if(i < slots1.length){
                        a = slots1[i][0];
                        b = slots1[i][1];
                    }
                }
            } else if(a <= d && d <= b){
                if(Math.min(d - a, d - c) >= duration){
                    ret.add(Math.max(a,c));
                    ret.add(ret.get(0) + duration);
                    break;
                } else{
                    j ++;
                    if(j < slots2.length){
                        c = slots2[j][0];
                        d = slots2[j][1];
                    }
                }
            } else if (b < c){
                i ++;
                if(i < slots1.length){
                    a = slots1[i][0];
                    b = slots1[i][1];
                }
            } else if(d < a){
                j ++;
                if(j < slots2.length){
                    c = slots2[j][0];
                    d = slots2[j][1];
                }
            }
        }
        
        return ret;
    }
}
