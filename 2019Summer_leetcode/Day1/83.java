/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode header  = new ListNode(head.val-1);
        header.next = head;
        ListNode prev = header, cur = head;
        while(cur != null) {
            if(prev.val == cur.val){
                prev.next = cur.next;
                cur = cur.next;
                continue;
            }
            if(cur == null || cur.next == null) break;
            prev = cur;
            cur = cur.next;
        }
        return header.next;
    }
}