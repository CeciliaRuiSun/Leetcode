public class Solution1 {
    //use deque and hashcode
    //not always work

    static public int HASH_SIZE=99997;
    int hash(int x) {
        return (x*11+x*7)%HASH_SIZE+HASH_SIZE;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        if (length == 0 || k == 0) {
            return false;
        }
        int[] exist = new int[HASH_SIZE*2+1];
        for (int i = 0 ; i < length && i <=k; ++i) {
          int a = hash(nums[i]);
          exist[a] +=1;
          if (exist[a] >=2) {
              System.out.println(a);
              return true;
          }
        }
        for (int j=k+1; j < length; ++j) {
            int i = j-k-1;
            exist[hash(nums[i])]-=1;
            int a = hash(nums[j]);
            exist[a]+=1;
            if (exist[a]>=2){
                System.out.println(a);
                return true;
            }
        }
        return false;
    }
}
