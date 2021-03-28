class Solution2 {
    public boolean isValid(String s) {
        // Runtime: 1 ms, faster than 98.57% 
        // Memory Usage: 37.4 MB, less than 31.49%
        
        Stack<Character> bracts = new Stack<>();        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(bracts.empty() || !isPair(bracts.peek(),c)){
                bracts.push(c);             
            } else{
                bracts.pop();
            }
        }
        
        return bracts.empty();
    }
    
    private boolean isPair(char a, char b){
        if(a == '(' && b == ')' || (a == '[' && b == ']') || (a == '{' && b== '}')){
            return true;
        }
        
        return false;
    }
}
