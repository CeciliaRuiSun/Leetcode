//
class Solution {
    public int removeDuplicates(int[] a) {
        if(a.length <= 1) return a.length;
        
        int i = 0, j = 1;
        while(j < a.length){
            if(a[j] != a[i]){
                a[i + 1] = a[j];
                i ++;
            }
            j ++;
        }
        
        return i + 1;
    }
}

//


class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }

        int temp = nums[0];
        int index = 1;
        int res = 1;
        
        for(int i = 1;i < len;i ++){
            if(nums[i] == temp){
                //do nothing
            } else{
                nums[index] = nums[i];
                temp = nums[i];
                index ++;
                res ++;
            }
        }
        
        return res;
    }
}
