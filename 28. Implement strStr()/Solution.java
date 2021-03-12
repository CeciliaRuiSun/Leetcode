class Solution {
    // Runtime: 0 ms, faster than 100.00% 
    // Memory Usage: 38.7 MB, less than 43.04%
    public int strStr(String haystack, String needle) {
        int h_len = haystack.length();
        int n_len = needle.length();
        
        if(n_len == 0){
            return 0;
        }
        
        if(h_len == 0){
            return -1;
        }
        
        int ret = -1;
        for(int i = 0; i <= h_len - n_len; i ++){
            if(haystack.substring(i,i + n_len).equals(needle)){
                ret = i;
                break;
            }
        }
        
        return ret;
    }
}