class Solution {
    //backtracking
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        if(nums.length < 1){
            return ret;
        }
        
        helper(ret, cur, visited, nums);
        return ret;
    }
        
    private void helper(List<List<Integer>> ret,List<Integer> cur,boolean[] visited, int[] nums){
        if(cur.size() == nums.length){
            ret.add(new ArrayList<Integer>(cur));
            return;
        }
        
        for(int i = 0; i < nums.length; i ++){
            if(visited[i]){
                continue;
            }
            cur.add(nums[i]);
            visited[i] = true;
            helper(ret, cur, visited, nums);
            cur.remove(cur.size() - 1);
            visited[i] = false;
        }
    }
}
