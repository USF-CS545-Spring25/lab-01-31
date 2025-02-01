package solution;

class MinStack {
    private int stack1[];
    private int stack2[];
    private int index;
    public static final int MAX_SIZE = 1000;

    public MinStack() {
        stack1 = new int[MAX_SIZE];
        stack2 = new int[MAX_SIZE];
        index = 0;
    }

    public void push(int val) {
        stack1[index] = val;
        if (index == 0)
            stack2[index] = val;
        else
            if (val < stack2[index-1])
                stack2[index] = val;
            else
                stack2[index] = stack2[index-1];
        index++;
    }

    public void pop() {
        index--;
    }

    public int top() {
        if (index == 0)
            throw new IllegalArgumentException();
        return stack1[index-1];
    }

    public int getMin() {
        return stack2[index-1];
    }
}