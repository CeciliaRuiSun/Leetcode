class Solution1 {
    //create a new array to store merged data, then copy back to nums1
    //Runtime: 0 ms, faster than 100.00% 
    //Memory Usage: 38.7 MB, less than 98.20%

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int index1 = 0;
        int index2 = 0;
        int indexRes = 0;
        
        while(index1 < m && index2 < n){
            if(nums1[index1] <= nums2[index2]){
                res[indexRes] = nums1[index1];
                index1 ++;
            } else{
                res[indexRes] = nums2[index2];
                index2 ++;
            }
            indexRes ++;
            
           
        }
        
        if(index1 == m){
            System.arraycopy(nums2,index2,res,indexRes,n-index2);
        }
        
        if(index2 == n){
            System.arraycopy(nums1,index1,res,indexRes,m-index1);
        }
        
        System.arraycopy(res,0,nums1,0,m+n);
        
    }
}