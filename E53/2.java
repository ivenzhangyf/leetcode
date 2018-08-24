/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        int c = 0;
        int val = 0;
        int sum = 0;
        while(l1!=null||l2!=null){
            sum = (l1!=null?l1.val:0)+(l2!=null?l2.val:0)+c;
            c = sum/10;
            val = sum % 10;
            tmp.val = val;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
            if(l1!=null||l2!=null||c!=0){
                tmp.next = new ListNode(c);
                tmp = tmp.next;
            }
        }
        return res;
    }
}