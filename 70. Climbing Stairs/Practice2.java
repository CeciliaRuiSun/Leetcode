class Solution {
    // compared with practice 1, no visited
    int count = 0;
    
    public int climbStairs(int n) {
        DFS(n,0);   
        return count;
    }
    
    private void DFS(int n, int k ){
        if(k == n){
            count ++;
            return;
        }
        
        DFS(n, k + 1);
                    
        if(k + 2 > n){
            return;
        } else{
            DFS(n, k + 2);
        }
    }
}