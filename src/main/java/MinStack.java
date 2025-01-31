/** Use two stacks (implemented as two arrays) to maintain a "min stack"
 * where we can push and pop elements in constant time,
 * but also get the minimum element and check the top of the stack in constant time.
 */
class MinStack {
    private int stack1[]; // where you will push each element normally
    private int stack2[]; // "min stack" - what exactly will it store?
    private int index;
    public static final int MAX_SIZE = 100;

    public MinStack() {
        stack1 = new int[MAX_SIZE];
        stack2 = new int[MAX_SIZE];
        index = 0;
    }

    /**
     * Push an element val onto the "MinStack"
     * @param val
     */
    public void push(int val) {
        // FILL IN CODE: must run in constant time
        // Push val onto stack1 which contains all elements
        // what will you push onto stack2?
    }

    /**
     * Pop an element from the "MinStack"
     * Will you pop from both stacks?
     */
    public void pop() {
        // FILL IN CODE: must run in constant time
    }

    /**
     * Return the top of stack 1
     * @return element at the top of stack 1
     */
    public int top() {
        if (index == 0)
            throw new IllegalArgumentException();
        // FILL IN CODE
        return 0;
    }

    /**
     * Returns the smallest element
     * (it is stored in stack 2 - how?)
     * @return
     */
    public int getMin() {
        // FILL IN CODE
        return 0;
    }
}