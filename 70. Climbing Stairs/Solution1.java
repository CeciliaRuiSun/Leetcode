class Solution {
    // This is a practive of recursion. Not applicable when n> 42
    // Variable visited is not necessary

    int count = 0;
    
    public int climbStairs(int n) {
        boolean[] visited = new boolean[n + 1];  //n steps
        //List<Integer> ls = new ArrayList<>();   //[0,1,2,3,...], [0,1,3,...],                                                         //[0,2,3,...]
        
        DFS(visited, 0);
        
        return count;
    }
    
    private void DFS(boolean[] visited, int k ){
        if(k == visited.length - 1){
            count ++;
            return;
        }
        
        if(!visited[k + 1]){
            visited[k + 1] = true;
            DFS(visited, k + 1);
            visited[k + 1] = false;
        }
        
        if(k + 2 > visited.length - 1){
            return;
        } else{
            visited[k + 2] = true;
            DFS(visited, k + 2);
            visited[k + 2] = false;
        }
    }
}