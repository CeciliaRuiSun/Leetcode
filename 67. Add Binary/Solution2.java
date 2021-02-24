class Solution {
    //This applies to all situation, no matter how big a or b is
    
    public String addBinary(String a, String b) {
        int ind = Math.max(a.length(), b.length());
        int gap = a.length() - b.length();
        //   a: 11010101
        //   b:     1101
        //-->b: 00001101
        StringBuilder helper = new StringBuilder();
        if(a.length() >= b.length()){
            for(int i = 0;i < gap;i ++){
                helper.append('0');
            }
            for(int j = gap; j < ind; j++){
                helper.append(b.charAt(j - gap));
            }
        } else{
            return addBinary(b,a);
        }
        
        String x = helper.toString();
        StringBuilder s = new StringBuilder();
        int temp = 0;   
        
        
        while(ind > 0){
            int cur_a = a.charAt(ind - 1) - '0';
            int cur_b = x.charAt(ind - 1) - '0';
            
            if(cur_a + cur_b + temp == 0){
                s.append('0');
            } else if (cur_a + cur_b + temp == 1){
                s.append('1');
                temp = 0;
            } else if (cur_a + cur_b + temp == 2){
                s.append('0');
                temp = 1;
            } else{
                s.append('1');
                temp = 1;
            }
            ind --;
        }
        
        if(temp == 1){
            s.append('1');
        } else{
            //do nothing
        }
        
        s.reverse();
        
        return s.toString();
    }
  }
  