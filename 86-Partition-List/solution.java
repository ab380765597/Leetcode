/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode left = new ListNode(0);
        ListNode leftdummy = left;
        ListNode right = new ListNode(0);
        ListNode rightdummy = right;
        
        while(head!=null){
            if(head.val<x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        left.next = rightdummy.next;
        return leftdummy.next;
    }
}