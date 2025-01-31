public class MinStackExample {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(1);
        obj.push(2);
        obj.push(10);
        obj.push(0);
        obj.push(3);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}
