package solution;

public class MinStackExample {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(1);
        obj.push(2);
        obj.push(10);
        obj.push(0);
        obj.push(3);
        System.out.println("Pushed 5, 1, 2, 10, 0, 3");
        System.out.println("At the top = " + obj.top());
        System.out.println("min = " + obj.getMin());
        System.out.println("Popped an element");
        obj.pop();
        System.out.println("At the top = " + obj.top());
        System.out.println("min = " + obj.getMin());
        obj.pop();
        System.out.println("Popped an element");

        System.out.println("At the top = " + obj.top());
        System.out.println("min = " + obj.getMin());
        obj.pop();
        System.out.println("Popped an element");
        obj.pop();
        System.out.println("Popped an element");

        System.out.println("At the top = " + obj.top());
        System.out.println("min = " + obj.getMin());
    }
}
