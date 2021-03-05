/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class 1650Solution {
    // when compare two Integers, use equals() rather than ==, or will be error
    // Runtime: 24 ms, faster than 26.51% 
    // Memory Usage: 39.5 MB, less than 94.50%

    public Node lowestCommonAncestor(Node p, Node q) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        
        while(p != null){
            ls1.add(p.val);
            p = p.parent;
        }
        
        while(q != null){
            ls2.add(q.val);
            q =q.parent;
        }
        
        int ret = 0;
        int size1 = ls1.size();
        int size2 = ls2.size();
        for(int i = Math.min(size1,size2) - 1; i >= 0; i --){            
            if(ls1.get(size1 - 1).equals(ls2.get(size2 - 1))){
                ret = ls1.get(size1 - 1);
                size1 --;
                size2 --;
            } else{ 
                break;
            }
        }
        
        return new Node(ret);
    }
}
