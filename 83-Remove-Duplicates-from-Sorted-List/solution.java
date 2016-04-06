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
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null){
            if(fast.val==fast.next.val){
                fast.next = fast.next.next;
            }else{
                fast = fast.next;
            }
        }
        return head;
    }
}