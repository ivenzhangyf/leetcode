class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next == null)
            return;
        ListNode h = head.next;
        ListNode mid = head;
        while(h!=null&&h.next!=null){
            mid = mid.next;
            h = h.next.next;
        }
        
        ListNode premid = mid;
        ListNode pre = mid.next;
        while(pre.next!=null){
            ListNode cur = pre.next;
            pre.next = cur.next;
            cur.next = premid.next;
            premid.next = cur;
        }
        
        ListNode p1 = head;
        ListNode p2 = premid.next;
        while(p1!=premid){
            premid.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = premid.next;
        }
        
        
        
    }
}