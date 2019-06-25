/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode cur = head, prev = header;
        while(cur != null) {
            while(cur != null && cur.val != val) {
                prev = cur;
                cur = cur.next;
            }
            if(cur == null) break;
            prev.next = cur.next;
            cur = cur.next;
        }
        return header.next;
    }
}