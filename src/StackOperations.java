public class StackOperations {
    private int[] stack = new int[100];
    private int top = -1;

    // Push operation
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into Stack.");
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(stack[top--] + " popped from Stack.");
    }

    // Peek operation
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    // Display operation
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}