// Runtime: 2 ms, faster than 75.17%
// Memory Usage: 39.5 MB, less than 25.67%

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        if(i < j) {return addBinary(b, a);}
        
        int carry = 0;
        StringBuilder ret = new StringBuilder();
        
        while(i >= 0 && j >= 0){
            int first = a.charAt(i) - '0';
            int sec = b.charAt(j) - '0';
            int sum = 0;
            
            if(first + sec + carry == 2){
                sum = 0;
                carry = 1;
            } else if (first + sec + carry == 3){
                sum = 1;
                carry = 1;
            } else{
                sum = first + sec + carry;
                carry = 0;
            }
            
            ret.append(String.valueOf(sum));
            
            j --;
            i --;
        }
        
        while (i >= 0){
            int num = a.charAt(i) - '0';
            int sum = 0;
            if(num + carry == 2){
                sum = 0;
                carry = 1;
            } else{
                sum = num + carry;
                carry = 0;
            }
            
            ret.append(String.valueOf(sum));
            i --;
        }
        
        if(i < 0 && j < 0 && carry == 1){
            ret.append('1');
            i --;
        }
        
        
        return ret.reverse().toString();
    }
}
