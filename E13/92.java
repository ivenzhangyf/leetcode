/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode headpoint = new ListNode(0);
        headpoint.next = head;
        ListNode pre = headpoint;
        ListNode latter = head;
        for (int i = 0;i<m-1;i++)
            pre = pre.next;
        ListNode former = pre.next;
        for (int i =1;i<n;i++)
            latter = latter.next;
        while(former!=latter){
            pre.next = former.next;
            former.next = latter.next;
            latter.next = former;
            former = pre.next;
        }
        return headpoint.next;
    }
}