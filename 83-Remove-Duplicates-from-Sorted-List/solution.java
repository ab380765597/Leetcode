/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            if(fast.val==slow.val){
                fast = fast.next;
            }else{
                slow.next = fast;
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next = fast;
        return head;
    }
}