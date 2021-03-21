public class solution {
    public int lengthOfLastWord(String s) {
        // Runtime: 0 ms, faster than 100.00%
        // Memory Usage: 38.8 MB, less than 15.85%
        
        int count = 0;
        int i = s.length() - 1;
        while(i >= 0 ){
            if(s.charAt(i) != ' '){
                count ++;
            }
            
            if(s.charAt(i) == ' ' && count > 0){
                break;
            }
            i --;
        }
        
        return count;
    }
}
