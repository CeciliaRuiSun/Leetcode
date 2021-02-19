public class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        return helper(s);
    }
    
    public boolean helper(String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        String sub = s.substring(1,s.length() - 1);
        
        if(first == last){
            return helper(sub);
        } else{
            return false;
        }
    }
}
