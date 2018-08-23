/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next == null)
            return head;
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        ListNode pre = head;
        ListNode cur = pre.next;
        while(cur!=null){
            pre.next = cur.next;
            cur.next = headNode.next;
            headNode.next = cur;
            cur = pre.next;
        }
        return headNode.next;
    }
}