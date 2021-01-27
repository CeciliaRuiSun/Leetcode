public class Solution {
    //Runtime: 10 ms, faster than 7.38%
    //Memory Usage: 37.2 MB, less than 83.86%

    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0;i < len;){
            String begin = Integer.toString(nums[i]);
            
            if(i == len - 1){
                list.add("" + begin + "");
                return list;
            }
            
            if(nums[i + 1] != nums[i] + 1){
                list.add("" + begin + "");
                i++;
            } else{
                while(i < len - 1 && nums[i + 1] == nums[i] + 1){
                    i ++;
                }
                String end = Integer.toString(nums[i]);
                list.add("" + begin + "->" + end + "");
                i ++;                
            }
        }
    }
}
