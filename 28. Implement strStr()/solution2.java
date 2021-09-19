// Runtime: 301 ms, faster than 83.73% 
// Memory Usage: 39.8 MB, less than 19.98%

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        
        int n = needle.length();
        for(int i = 0; i < haystack.length(); i ++){
            if(i + n <= haystack.length() && haystack.substring(i, i + n).equals(needle) ){
                return i;
                    }
        
        }
        
        return -1;
    }
}

