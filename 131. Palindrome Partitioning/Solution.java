public class Solution {
    // Source: YouTube happygirlzt
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<>();
        ArrayList<String> cur = new ArrayList<>();
        
        if(s.length() == 0){
            return ret;
        } 
        
        DFS(ret, cur, s, 0);
        return ret;
    }
    
    private void DFS(List<List<String>> ret, ArrayList<String> cur, String s, int k){
        if(k == s.length()){
            ret.add(new ArrayList(cur));
            return;
        }
        
        for(int i = k;i < s.length();i ++){
            if(isPal(s,k,i)){
                cur.add(s.substring(k,i+1));
                DFS(ret, cur, s, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
    
    private boolean isPal(String s, int low, int high){
        while(low <= high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
}
