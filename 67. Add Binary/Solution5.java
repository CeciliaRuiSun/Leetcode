//Runtime: 1 ms, faster than 99.99% 
//Memory Usage: 42.4 MB, less than 74.54%

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
            
        while(i >= 0 || j >= 0){
            int num1 = 0, num2 = 0;
            if(i >= 0) num1 = a.charAt(i) - '0';
            if(j >= 0) num2 = b.charAt(j) - '0';
            
            int cur = num1 + num2 + carry;
            if(cur == 3){
                sb.append('1');
                carry = 1;
            } else if(cur == 2){
                sb.append('0');
                carry = 1;
            } else{
                sb.append(String.valueOf(cur));
                carry = 0;
            }
            i --;
            j --;
        }
        
        if(carry == 1) sb.append('1');
        
        return sb.reverse().toString();
    }
}
