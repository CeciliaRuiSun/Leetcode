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


//
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ret = new StringBuilder();
        boolean flag = false;
        for(int i = 0 ; i < strs[0].length(); i ++){
            char cur = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j ++){
                if(i >= strs[j].length() || strs[j].charAt(i) != cur){
                    flag = true;
                    break;
                }
            }
            
            if(flag) break;
            ret.append(cur);
        }
        return ret.toString();
    }
}
