class MyCircularQueue {
    private int[] queue;
    private int rear;
    private int front;
    private int size;
    private int count;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0;
        rear = -1;
        size = k;
        count = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()){
            rear = (rear+1)%size;
            queue[rear]=value;
            
            count++;
            return true;
        }
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()){
            
            queue[front] = -1;
            front = (front+1)%size;
            count--;
            return true;
        }
        return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty()){
            return queue[front];
        }
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty()){
            return queue[rear];
        }
        return -1;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return count==0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return count == size;
    }
}