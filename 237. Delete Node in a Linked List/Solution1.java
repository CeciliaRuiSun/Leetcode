public class Solution1 {
    public void deleteNode(ListNode node) {
        // 4 - 5 - 1 - 9
        // 4 - 1 - 9
        
        ListNode N = new ListNode();
        while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null){
                N = node;
            }
            node = node.next;
            
        }
        
        N.next = null;
        
    }
}
