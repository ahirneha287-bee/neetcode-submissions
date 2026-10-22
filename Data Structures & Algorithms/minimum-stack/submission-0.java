class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minstack;

    public MinStack() {
         stack = new ArrayDeque<>();
         minstack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty())
        {
            minstack.push(val);
        }
        else{
            int min = Math.min(val, minstack.peek());
             minstack.push(min);
        }
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();   
    }
    
    public int top() {
        return stack.peek();   
    }
    
    public int getMin() {
       return minstack.peek();      
    }
}
