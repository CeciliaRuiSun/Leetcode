class Solution1 {
    // this is a practice of conversion between binary and decimal
    // will only work within 64 bits
    
    public String addBinary(String a, String b) {
        long res = toDecimal(a) + toDecimal(b);
        return toBinary(res);
    }
    
    private long toDecimal(String a){
        long ret = 0;
        for(int i = a.length() - 1;i >= 0;i--){
            char cur = a.charAt(i);
            ret = ret + (cur - '0') * (long)Math.pow(2,a.length() - 1 - i);
        }

        return ret;
    }
    
    private String toBinary(long init){
        List<Long> ls = new ArrayList<>();
       
        while(true){
            if(init == 0){
                ls.add(0L);
                break;
            }
            if(init == 1){
                ls.add(1L);
                break;
            }
            long reminder = init % 2;
            ls.add(reminder);
            init = init / 2;
        }
        
        StringBuilder s = new StringBuilder();
        for(int i = ls.size() - 1;i >= 0;i --){           
            s.append(ls.get(i));
        }
        
        return s.toString();
    }
}
