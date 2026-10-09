public class QueueOperations {
    private int[] queue = new int[100];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    // Enqueue operation
    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        System.out.println(value + " added to Queue.");
    }

    // Dequeue operation
    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(queue[front] + " removed from Queue.");
        front = (front + 1) % queue.length;
        size--;
    }

    // Peek operation
    public void peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    // Display operation
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}