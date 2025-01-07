/* Leet Code - 155git  */

class MinStack {

    Stack<Integer>st;
    Stack<Integer>min_st;
    public MinStack() {
        this.st=new Stack<>();
        this.min_st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min_st.isEmpty())
        {
            min_st.push(val);
        }
        else
        {
            if(val<=min_st.peek())
            {
                min_st.push(val);
            }
        }
    }
    
    public void pop() {
        int num=st.peek();
        st.pop();
        if(num==min_st.peek())
        {
            min_st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(!min_st.isEmpty())
        {
            return min_st.peek();
        }
        else
        {
            return 0;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */