/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode postHead = reverse(mid.next);
        mid.next = null;
        merge(head, postHead);
    }
    private ListNode findMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
    private void merge(ListNode h1, ListNode h2){
        if(h1==null && h2==null){
            return;
        }
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int counter=1;
        while(h1!=null && h2!=null){
            if(counter%2==1){
                head.next = h1;
                h1 = h1.next;
            }else{
                head.next=h2;
                h2 = h2.next
            }
            head = head.next;
            counter++;
        }
        if(h1!=null){
            head.next = h1;
        }else{
            head.next=h2;
        }
        
    }
}