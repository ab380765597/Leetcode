/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        while(fast!=null){
            if(fast.val == val){
                fast = fast.next;
            }else{
                slow.next = fast;
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next = null;
        return dummy.next;
    }
}