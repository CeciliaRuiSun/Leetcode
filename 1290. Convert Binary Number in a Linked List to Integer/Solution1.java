/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution1 {
    public int getDecimalValue(ListNode head) {
        String headToString = "";
        
        while(head!=null){
            headToString = headToString.concat(Integer.toString(head.val));
            head = head.next;
        }
        
        System.out.println("headToString: " + headToString);
        
        int len = headToString.length();
        int res = 0;
        
        for(int i = 0;i < len;i++){
           int num = headToString.charAt(i) - '0';
           res = res + num * ((int) Math.pow(2, (len - i - 1)));
            System.out.println("num is " + num + " res is " + res);
        }
        
        return res;
          
    }
    

}