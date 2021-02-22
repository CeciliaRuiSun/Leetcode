class Solution {
    //start from 1st char of 1st string, see if it is in all other strings
    //note: length of 1st string may be longer than others, eg ["ab", "a"]
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1){
            return "";
        }
        
        StringBuilder ret = new StringBuilder();
        int ind = 0;
        int num = strs[0].length();
        while(ind < num){
            char cur = strs[0].charAt(ind);
            boolean common = true;
            for(int i = 1;i < strs.length;i++){
                if(ind >= strs[i].length() || strs[i].charAt(ind) != cur){
                    common = false;
                    break;
                }
            }
            
            if(common){
                ret.append(cur);
            } else{
                break;
            }
            
            ind ++;
        }
        
        return ret.toString();
    }
}
