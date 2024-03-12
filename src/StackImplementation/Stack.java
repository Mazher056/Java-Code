package StackImplementation;

public class Stack  extends Exception {
    int ptr = -1;
    private int data[];
    private static int DEFAULT_SIZE = 10;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Overflow");
        }
        else {

            data[++ptr] = item;
        }
    }

    protected boolean isFull() {
        if (data.length == ptr - 1) {
            return true;
        }
        return false;
    }

    protected boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }
        return false;
    }
}
