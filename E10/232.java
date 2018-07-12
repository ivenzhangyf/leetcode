class MyQueue {
       public Stack<Integer> in = new Stack<>();
       
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> out = new Stack<>();
        while(!in.isEmpty())
            out.push(in.pop());
        int res = out.pop();
        while(!out.isEmpty())
            in.push(out.pop());
        return res;
        
    }
    
    /** Get the front element. */
    public int peek() {
        Stack<Integer> out = new Stack<>();        
        while(!in.isEmpty())
            out.push(in.pop());
        
        int res = out.peek();
        while(!out.isEmpty())
            in.push(out.pop());
        
        return res;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (in.isEmpty())
            return true;
        return false;
    }
}