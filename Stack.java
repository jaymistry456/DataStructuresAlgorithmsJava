public class Stack {
    private int[] stack;
    private int maxSize;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if(isFull()) {
           System.out.println("Stack is full!");
        }
        else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println(stack.pop());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());;
        stack.push(60);
        System.out.println(stack.peek());
    }
}