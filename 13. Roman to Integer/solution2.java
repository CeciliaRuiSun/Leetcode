// Runtime: 8 ms, faster than 27.56%
// Memory Usage: 38.9 MB, less than 90.09%

class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        
        if(isspecial(s)){
            return map.get(s);
        }
        
        int ret = 0;
        int i=0;
        while(i < s.length()){
            if(i+1 < s.length() && isspecial(s.substring(i,i+2))){
                ret += map.get(s.substring(i,i+2));
                i += 2;
            } else{
                ret += map.get(String.valueOf(s.charAt(i)));
                i ++;
            }
        }
        return ret;        
    }
    
    private boolean isspecial(String s){
        if(s.equals("IV") || s.equals("IX") || s.equals("XL") ||s.equals("XC")
          ||s.equals("CD") ||s.equals("CM")){
            return true;
        } else{
            return false;
        }
    }
}


// 
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int ret = 0;
        int i = 0;
        while(i < s.length() - 1){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
                ret += map.get(s.charAt(i));
            } else{
                ret -= map.get(s.charAt(i));
            }
            i ++;
        }
        
        ret += map.get(s.charAt(s.length() - 1));
        return ret;
    }
}
