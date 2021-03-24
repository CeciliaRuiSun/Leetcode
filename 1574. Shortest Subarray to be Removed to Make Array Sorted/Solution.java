public class Solution {
    // Runtime: 1 ms, faster than 100.00%
    // Memory Usage: 56.7 MB, less than 69.18%
    public int findLengthOfShortestSubarray(int[] arr) {
        int len = arr.length;
        int L = 0, R = len - 1;
        while(L < len - 1 && arr[L + 1] >= arr[L]){
            L ++;
        }
        
        while(R > 0 && arr[R - 1] <= arr[R]){
            R --;
        }
        
        int count = Math.min(len - 1 - L, R);
        
        if(L < R){
           for(int x = L; x >= 0; x --){
               for(int y = R; y <= len - 1; y++){
                   if(len - (y - x - 1) < Math.max(x + 1, len - R)){
                       break;
                   } else{
                      if(arr[x] <= arr[y]){
                          count = Math.min(count, y - x - 1);
                       break;
                      }                           
                   }
               
               }
           } 
        } else{
            count = 0;
        }

        return count;
    }
}
