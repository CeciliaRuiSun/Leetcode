// 1 ms, faster than 79.06% 
// 41.9 MB, less than 70.89%

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i ++){
            if(compare(needle, haystack.substring(i, i + needle.length()))) return i;
        }
        
        return -1;
    }
    
    private boolean compare(String needle, String sub){
        for(int i = 0; i < needle.length(); i ++){
            if(needle.charAt(i) != sub.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
