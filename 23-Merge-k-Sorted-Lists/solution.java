/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }
        return mergeHelper(lists, 0, lists.length-1);
    }
    private ListNode mergeTwo(ListNode l1, ListNode l2){
        if(l1==null && l2==null){
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if(l1!=null){
            head.next = l1;
        }
        if(l2!=null){
            head.next = l2;
        }
        return dummy.next;
    }
    private ListNode mergeHelper(ListNode[] lists, int s, int e){
        int start = s;
        int end = e;
        int mid = start+(end-start)/2;
        
        ListNode left = mergeHelper(lists, start, mid);
        ListNode right = mergeHelper(lists, mid+1, end);
        ListNode head = mergeTwo(left, right);
        return head;
    }
}