public class Queue {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int itemCount;

    public Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        itemCount = 0;
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }

    public boolean isFull() {
        return itemCount == maxSize;
    }

    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full!");
        }
        else {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
            itemCount++;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % maxSize;
        itemCount--;
        return value;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
