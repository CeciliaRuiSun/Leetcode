class Solution {
 /* The Tribonacci sequence Tn is defined as follows: 

    T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

    Given n, return the value of Tn.*/

    class V {
        public int x;  // T(n)
        public int y;  // T(n-1)
        public int z;  // T(n-2)
    }
    
    public V F(int n){
        if (n==2){
            V ret = new V();
            ret.x = 1;  // T(2)
            ret.y = 1;  // T(1)
            ret.z = 0;  // T(0)
            return ret;
        }
        V last = F(n-1);
        // last.x
        // last.y
        // last.z
            
        V ret = new V();
        ret.x = last.x +last.y+last.z;
        ret.y = last.x;
        ret.z = last.y;
        return ret;
    }
    
    public int tribonacci(int n) {
       if(n == 0){
           return 0;
       }
        if(n == 1){
           return 1;
       }
        V ret = F(n);
       return ret.x;
    }
}