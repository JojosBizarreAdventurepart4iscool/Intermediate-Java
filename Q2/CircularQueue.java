public class CircularQueue<T extends Comparable<T>> {
    public T[] buffer;
    public int head = -1;
    public int tail = -1;
    CircularQueue<T> next;
    public int size;

    public int capacity = 0;

    public CircularQueue(int c) {
        buffer = (T[]) new Comparable[c];
        capacity = c;
        size = 0;
    }

    public boolean isFull() {
        if (tail == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (head == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(CircularQueue<T> Q, T value) {
        if (head == -1) {
            head = 0;
        }
        if (Q.isFull()) {
            System.out.println("Full");
        } else {
            tail++;
            Q.buffer[Q.tail] = value;
            Q.tail = (Q.tail + 1) % Q.capacity;
            size++;
        }
    }

    public T Dequeue(CircularQueue<T> Q) {
        T value = null;
        if (head == -1) {
            head = 0;
        }
        if (Q.isEmpty()) {
            System.out.println("Empty");
        } else {
            head++;
            value = Q.buffer[Q.head];
            Q.head = (Q.head + 1) % Q.capacity;
            Q.size--;
        }
        return value;
    }

    public T peek(CircularQueue<T> Q){
        if(Q.isEmpty()){
            System.out.println("Empty");
            return null;
        }else{
            return Q.buffer[Q.head];
        }

    }
}
