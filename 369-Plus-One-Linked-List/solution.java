/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            if(fast.val!=9){
                fast = fast.next;
                slow = slow.next;
            }else{
                fast = fast.next;
            }
        }
        if(slow == head){
            slow.val = 1;
            slow = slow.next;
            while(slow!=null && slow.next!=null){
                slow.val = 0;
                slow = slow.next;
            }
            slow.next = new ListNode(0);
            return head;
        }
        slow.val = slow.val+1;
        while(slow!=null){
            slow.val = 0;
            slow = slow.next;
        }
        return head;
    }
}