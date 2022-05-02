class Solution {
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i --){
            int cur = digits[i];
            if(cur + carry > 9){
                arr.add(0, (cur + carry)%10);
                carry = 1;
            } else{          
                arr.add(0, cur + carry);
                carry = 0;
            }
        }
        
        if(carry == 1){
            arr.add(0,1);
        }
        
        int[] ret = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            ret[i] = arr.get(i);
        }
        
        return ret;
    }
}


//
class Solution1 {
    //use for loop
    //Runtime: 0 ms, faster than 100.00%
    //Memory Usage: 38.8 MB, less than 10.82%

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int step = 1;
        
        for(int i = len - 1;i >= 0;){
            if(digits[i] < 9){
                digits[i] += step;
                return digits;
            } else {
                digits[i] = 0;
                i --;
            }
        }
        
        if(digits[0] == 0){
            int[] newDigits = new int[len + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        
        return digits;
    }
}
