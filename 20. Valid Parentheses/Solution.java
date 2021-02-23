class Solution {
    // use stack
    public boolean isValid(String s) {
        int len = s.length();
        if(len == 1){
            return false;
        }

        int ind = 0;
        List<Character> stk  = new ArrayList<>();
        for(int i = 0;i < len;i ++){
            char cur = s.charAt(i);
            if(isOpening(cur)){
                stk.add(cur);
                ind ++;
            } else {
                if(stk.size() > 0 && isPair(stk.get(ind - 1),cur)){
                    stk.remove(ind - 1);
                    ind --;
                } else {
                    return false;
                }
            }       
        }
        
        if(ind == 0){
            return true;
        } 
        
        return false;
    }
    
    private boolean isOpening(char a){
        String s = "({[";
        for(int i = 0;i < s.length();i++){
            if(a == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    private boolean isPair(char a, char b){
        if(a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']'){
            return true;
        } else{
            return false;
        }
    }
}
