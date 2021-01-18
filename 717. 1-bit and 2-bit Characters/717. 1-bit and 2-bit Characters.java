class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        
        //{...1} --> false
        if(bits[len - 1] == 1){
            return false;
        }
        
        //{1,0} --> false
        if(len == 2 && bits[0] == 1 && bits[1] == 0){
            return false;
        }
                
        //{...0111...1110}  odd # of 1 --> false
        //               even # of 1 --> true
        //{...1111...1110}  odd # of 1 --> true
        //               even # of 1 --> false        
        if(len > 2){
            //use helper to store 1s in the middle
            ArrayList<Integer> helper = new ArrayList<Integer>();
            int index = len - 2;
            while(index > 0 && bits[index] != 0){
                helper.add(bits[index]);
                index--;
            }
            
            //helper contains even nums of 1
            if(helper.size() % 2 == 0){
                if(bits[index] == 1){
                    return false;
                }
            }

            //helper contains odd nums of 1
            if(helper.size() % 2 == 1){
                if(bits[index] == 0){
                    return false;
                }
            }

            
        }
        
        return true;
    }
}