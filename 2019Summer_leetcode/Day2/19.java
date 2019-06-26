/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode cur = head,prev = head;
        ListNode counter = head;
        while(counter != null){
            counter = counter.next;
            length++;
        }
        int pos = length - n;
        if(pos == 0) return head.next;
        while(pos > 0){
            pos--;
            prev = cur;
            if(cur.next == null) {
                prev.next = null;
                return head;
            }
            cur = cur.next;
        }
        prev.next = cur.next;
        return head;
    }
}