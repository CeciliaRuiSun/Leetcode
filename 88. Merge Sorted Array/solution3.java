// Two pointer, start from end of non-0 nums1 & nums2, put bigger number to end of nums1
// Runtime: 0 ms, faster than 100.00% 
// Memory Usage: 39.3 MB, less than 36.36% 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }
        
        int i = m - 1;   // 0 ~ m-1
        int j = n - 1;   // 0 ~ n - 1
        int l = nums1.length - 1;
        int temp = 0;
        
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[l] = nums1[i];
                i --;
            } else{
                nums1[l] = nums2[j];
                j --;
            }
            l --;
        }
        
        if(j >= 0){
            System.arraycopy(nums2,0,nums1,0,j + 1);
        }
    }
}
