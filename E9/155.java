class MinStack {
    static final int MAXLEN = 50000;
    public int top;
    public int[] stack = new int[MAXLEN+1];
    public int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        
        top=-1;
        
    }
    
    public void push(int x) {
        top++;
        stack[top]=x;
        if (x<min) min=x;
    }
    
    public void pop() {
        stack[top]=0;
        top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        int tmp = top;
        int min = Integer.MAX_VALUE;
        while(tmp>-1){
            if(stack[tmp]<min)
            min = stack[tmp];
            tmp--;
        }
        return min;
    }
}