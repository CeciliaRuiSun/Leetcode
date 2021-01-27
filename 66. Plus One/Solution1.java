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
            System.arraycopy(digits, 0, newDigits, 1, len);
            return newDigits;
        }
        
        return digits;
    }
}