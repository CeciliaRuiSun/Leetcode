class Solution3 {
    //Divided by 2 and mod 2 because of the binary system
    //for decimal system, change 2 to 10
    
    
  public String addBinary(String a, String b) {
      int ind_a = a.length() - 1;
      int ind_b = b.length() - 1;
      int carrier = 0;
      StringBuilder ret = new StringBuilder();
      
      while(ind_a >= 0 || ind_b >= 0 || carrier > 0){
          int aa = 0;
          int bb = 0;
          if(ind_a < 0){
              // do nothing
          } else {
              aa = a.charAt(ind_a) - '0';
          }
          
          if(ind_b < 0){
    
          } else {
              bb = b.charAt(ind_b) - '0';
          }
          
          ret.append((aa + bb + carrier) % 2);
          carrier = (aa + bb + carrier) / 2;
          
          ind_a --;
          ind_b --;
      }
      
      ret.reverse();
      return ret.toString();
  }
}
