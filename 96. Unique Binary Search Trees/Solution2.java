import java.util.Map;

class Solution2 {
    // neat version of solution1
    // Time: O(n2)

    Map<Integer,Integer> map = new HashMap<>();
        
    public int numTrees(int n) {
        if(n <= 1){
            return 1;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }

        int ret = 0;
        for(int i = 0; i < n; i++){

            ret += numTrees(i) * numTrees(n - 1 - i);
        }


        map.put(n, ret);
        return ret;
    }
}