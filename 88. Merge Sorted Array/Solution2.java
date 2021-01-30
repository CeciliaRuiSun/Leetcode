public class Solution2 {
    //No new array created. move data in nums1 to end of array
    //Runtime: 0 ms, faster than 100.00%
    //Memory Usage: 39.3 MB, less than 46.50%

    public void merge(int[] nums1, int m, int[] nums2, int n) {  
        for(int i = 0;i < m;i ++){
            nums1[m + n - 1 - i] = nums1[m - 1 - i];
        }
        
        int index1 = n;
        int index2 = 0;
        int index = 0;
        
        while(index2 < n){
            if(index1 < m + n && nums1[index1] <= nums2[index2]){
                nums1[index] = nums1[index1];
                index1 ++;
            } else{
                nums1[index] = nums2[index2];
                index2 ++;
            }
            index++;   
        }
      }
}
