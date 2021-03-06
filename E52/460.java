class LFUCache {
     private HashMap<Integer,CacheNode> map;
     private int capacity;
     private CacheNode head = new CacheNode(-1,-1);
     private CacheNode tail = new CacheNode(-1,-1);
     private class CacheNode{
        int key,value;
        CacheNode pre,next;
        CacheNode(int key,int value){
            this.key = key;
            this.value = value;
            this.pre = null;
            this.next = null;
        }
    }
    //head.next和tail.next分别指向链表的头结点和尾结点
      
     private void update(CacheNode target,boolean isNew){
        if(target!=tail.next){
            if(!isNew){
                target.pre.next = target.next;
                target.next.pre = target.pre;
            }
            tail.next.next = target;
            target.pre = tail.next;
            tail.next = target;
        }
        
    }
    public LFUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            CacheNode node = map.get(key);
            update(node,false);
            tail.next.next = null;
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        // cache中存在节点
        if (map.containsKey(key)) {
            CacheNode target = map.get(key);
            target.value = value;
            map.put(key, target);
            // 将访问过的已有节点移动到链表尾部
            update(target, false);
        } else if(map.size() < capacity) {    // cache未满，添加节点
            CacheNode newNode = new CacheNode(key, value);
            map.put(key, newNode);
            if (head.next == null) {
                head.next = newNode;
                newNode.pre = head;
                tail.next = newNode;
            } else {
                // 将新建节点移动到链表尾部
                update(newNode, true);
            }
        } else {    // cache已满，淘汰链表链表头部节点，新节点加入到链表尾部
            CacheNode newNode = new CacheNode(key, value);
            map.remove(head.next.key);
            map.put(key, newNode);
            // cache中只有一个元素
            if (head.next == tail.next) {
                head.next = newNode;
                tail.next = newNode;
            } else {    // cache中不止一个元素，删除头部
                head.next.next.pre = head; // 更新新头部.pre = head
                head.next = head.next.next;// 更新新头部
                // 将新建节点移动到链表尾部
                update(newNode, true);
            }
        }
    }
}