public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode newHead = head;
        int size = 0;
        while(newHead != null){
            size ++;
            newHead = newHead.next;
        }
        int index = 0;
        if(size % 2 ==1){
            index = (size + 1) / 2 - 1;
        } else {
            index = size / 2;
        }
        
        while(index -- > 0){
            head = head.next;
        }
        
        return head;
    }
}
