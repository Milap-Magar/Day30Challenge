import java.util.EmptyStackException;

class Stack<T> {
    private Node<T> top;
    private int size;

    // Node class to represent each element in the stack
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        size = 0;
    }

    // Push a new element onto the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop an element off the stack
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Peek at the top element of the stack without removing it
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get the size of the stack
    public int getSize() {
        return size;
    }

    // Main method for testing
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Output: Top element: 3
        System.out.println("Stack size: " + stack.getSize()); // Output: Stack size: 3

        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 3
        System.out.println("Top element after pop: " + stack.peek()); // Output: Top element after pop: 2
        System.out.println("Stack size after pop: " + stack.getSize()); // Output: Stack size after pop: 2
    }
}
