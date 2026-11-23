public class CircularDequeue<T extends Comparable<T>> {
    public T[] buffer;
    public int head = -1;
    public int tail = -1;
    CircularDequeue<T> next;
    public int size;
    public int capacity = 0;

    public CircularDequeue(int c) {
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

    public void addFront(T value) {
        if (tail == -1) {
            tail = 0;
        }
        if (this.isFull()) {
            System.out.println("Full");
        } else {
            head++;
            this.buffer[this.head] = value;
            this.head = (this.head + 1) % this.capacity;
            size++;
        }
    }

    public void addRear(T value) {
        if (head == -1) {
            head = 0;
        }
        if (this.isFull()) {
            System.out.println("Full");
        } else {
            tail++;
            this.buffer[this.tail] = value;
            this.tail = (this.tail + 1) % this.capacity;
            size++;
        }
    }

    public T deleteFront() {
        T value = null;
        if (head == -1) {
            head = 0;
        }
        if (this.isEmpty()) {
            System.out.println("Empty");
        } else {
            head++;
            value = this.buffer[this.head];
            this.head = (this.head + 1) % this.capacity;
            this.size--;
        }
        return value;
    }

    public T deleteRear() {
        T value = null;
        if (tail == -1) {
            tail = 0;
        }
        if (this.isEmpty()) {
            System.out.println("Empty");
        } else {
            tail++;
            value = this.buffer[this.head];
            this.head = (this.head + 1) % this.capacity;
            this.size--;
        }
        return value;
    }

    public T peekFront() {
        if (this.isEmpty()) {
            System.out.println("Empty");
            return null;
        } else {
            return this.buffer[this.head];
        }
    }

    public T peekRear() {
        if (this.isEmpty()) {
            System.out.println("Empty");
            return null;
        } else {
            return this.buffer[this.tail];
        }

    }

    public void print40() {
        int temp = head;
        for (int x = 0; x < 40; x++) {
            System.out.print(this.buffer[temp]);
            temp++;
        }
    }
}
