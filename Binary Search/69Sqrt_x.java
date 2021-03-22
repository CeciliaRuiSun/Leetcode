public class 69Sqrt_x {
    /* ** stackoverflow
    public int mySqrt(int x) {
        
        return helper(0, x, x);
    }
    
    private int helper(int a, int b, int x){
        int mid = (a + b) / 2;
        if(mid * mid <= x && (mid + 1)*(mid + 1) > x){
            return mid;
        } else if((mid + 1)*(mid + 1) == x){
            return (mid + 1);
        } else if (mid * mid > x){
            return helper(a, mid, x);
        } else{
            return helper(mid, b, x);
        }
    }
    */
    
    // TimeExceeded
    public int mySqrt(int x) {
        int ret = 0;
        for(long i = 0; i <= x; i++){
            if((int)i * i == x || ((int)i * i < x && (int)(i + 1)*(i + 1) > x)){
                ret = (int)i;
                break;
            }
        }
        
        return ret;
    }
    
    
    /*
   public int mySqrt(int x) {
       // author: david2999999

        long left = 0, right = (x / 2) + 1;

        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return (int) left;
    }
    */
}
