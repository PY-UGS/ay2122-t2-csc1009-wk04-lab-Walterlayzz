public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = -1;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(int value) {
        this.size += 1;
        this.elements[this.size] = value;
    }

    public int pop() {
        int value = this.elements[this.size];
        this.size -= 1;
        return value;
    }

    public int peek() {
        return this.elements[this.size];
    }

    public boolean empty(){
        return this.size == -1;
    }

}