/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        int count = 0;
        ListNode odd = new ListNode(0);
        ListNode dummyO  = odd;
        ListNode even = new ListNode(0);
        ListNode dummyE = even;
        while(head!=null){
            if(count%2==0){
                odd.next = head;
                odd = odd.next;
            }else{
                even.next = head;
                even = even.next;
            }
            head = head.next;
            count++;
        }
        odd.next = dummyE.next;
        even.next = null;
        return dummyO.next;
    }
}