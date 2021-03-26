public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char cha: s.toCharArray()){
            if(map.containsKey(cha) && map.get(cha) > 0){
                map.put(cha, map.get(cha) - 1);
            } else{
                return false;
            }
            
        }
        
        return s.length() == t.length();
    }
}
