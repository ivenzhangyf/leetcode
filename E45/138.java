public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        while(cur!=null){
            RandomListNode tNode = new RandomListNode(cur.label);
            map.put(cur,tNode);
            cur=cur.next;
        }
        cur = head;
        while(cur!=null){
            RandomListNode node = map.get(cur);
            node.next = map.get(cur.next);
            node.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}