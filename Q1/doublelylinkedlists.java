import java.util.Iterator;

public class doublelylinkedlists<T extends Comparable<T>> implements Iterable<T> {
    private class Node implements Comparable<Node> {
        T data;
        Node prev;
        Node next;

        Node(T data) {
            this.data = data;
            prev = null;
            next = null;

        }

        public int compareTo(Node o) {
            return data.compareTo(o.data);
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void doublelylinkedlists() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T element) {
        var temp = new Node(element);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;
        size++;
    }

    public void addFront(T element) {
        var temp = new Node(element);
        if (head != null) {
            temp.next = head;
            head.prev = temp;
        }
        head = temp;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node current = head;
        for (int x = 0; x < index; x++) {
            current = current.next;
        }
        return current.data;
    }

    public void print() {
        for (Node current = head; current != null; current = current.next) {
            System.out.println(current.data + " ");
        }
        System.out.println();
    }

    public void printReverse() {
        for (Node current = tail; current != null; current = current.prev) {
            System.out.println(current.data + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int index, T element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node current = head;
        for (int x = 0; x < index; x++) {
            current = current.next;
        }
        current.data = element;
    }

    public void addSorted(T element) {
        Node temp = new Node(null);
        Node current = head;
        while(current.next != null){
            if(current.data.compareTo(current.next.data) > 0) {
                current = current.next;
                current.next = current;
            }
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
                Node current  = head;
        if(index == 0){
            while(current.next != head){
                current = current.next;
            }
            head = head.next;
            current.next = head;
        }else{
            for(int x = 0; x < index-1; x++){
                current = current.next;
                current.next = current.next.next;
            }
            size--;
        }
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node current = head;
        for (int x = 0; x < index; x++) {
            current = current.next;
        }
        current.data = element;
    }

    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }

        };
    }
}
