
import java.util.Iterator;

public class intlinkedlists implements Iterable<Integer> {
    private class Node {
        int data;
        Node next; // Pointer to next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // root of the list
    private Node tail;

    public intlinkedlists() {
        head = null;
    }

    public void addFront(int data) {
        var node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        var node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        var current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void print() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
        System.out.println();
    }

    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public Integer next() {
                int data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public int getCount() {
        int cnt = 0;
        Node current = head;
        while (current.next != null) {
            cnt++;
            current = current.next;
        }
        return cnt;
    }

    public boolean add(int num, int spot) {
        Node added = new Node(num);
        Node current = head;
        for(int x = 0; x < spot-1; x++){
            current = current.next;
        }
    added = current.next;
    current = added;
    return true;
    }

    public boolean isEmpty() {
        Node current = head;
        if (current.data < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isThere(int n) {
        Node current = head;
        while (current.next != null) {
            if (current.data == n) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public int getFirst() {
        Node current = head;
        return current.data;
    }

    public int getLast() {
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        return current.data;
    }

    public int getSpot(int n) {
        Node current = head;
        for(int x = 0; x < n; x++){
            current = current.next;
        }
        return current.data;
    }

    public void removeFirst() {
        Node current = head;
        current = null;
    }

    public void removeLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current = null;
    }

    public int countless10() {
        Node current = head;
        int cnt = 0;
        for(int x = 0; x < 9; x++){
            if(current.next == null){
                return cnt;
            }else{
            current = current.next;
            cnt++;
            }
        }
        return cnt;
    }

    public void removeSpot(int n) {
        Node current = head;
        for(int x = 0; x < n; x++){
            current = current.next;
        }
        current = null;
    }

    public void clear() {
        Node current = head;
        while (current.next != null) {
            current = null;
            current = current.next;
        }
    }

    public boolean checkforNum(int n) {
        Node current = head;
        while (current.next != null) {
            if (current.data == n) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int getNum(int n) {
        Node current = head;
        for(int x = 0; x < n; x++){
            if(current.next == null){
                return -1;
            }
            current=current.next;
        }
        return current.data;
    }

    public intlinkedlists getReverse() {
        Node current = head;
        intlinkedlists reverse = new intlinkedlists();
        while(current != null){
            reverse.addFront(current.data);
            current = current.next;
        }
        return reverse;

    }

    public double avg() {
        int length = 0;
        int num = 0;
        Node current = head;
        while (current.next != null) {
            length++;
            num += current.data;
            current = current.next;
        }
        return num / length;
    }

    public int min() {
        Node current = head;
        int min = current.data;
        while (current.next != null) {
            if (current.data < min) {
                min = current.data;
                current = current.next;
            }
            current = current.next;
        }
        return min;
    }

    public int max() {
        Node current = head;
        int max = current.data;
        while (current.next != null) {
            if (current.data > max) {
                max = current.data;
                current = current.next;
            }
            current = current.next;
        }
        return max;
    }
    
    public int firstMax(){
        Node current = head;
        return current.data;
        
    }
    public int lastMax(){
             Node current = head;
        int max = current.data;
        while (current.next != null) {
            if (current.data > max) {
                max = current.data;
                current = current.next;
            }
            current = current.next;
        }
        return max;
    }
    public void sort(){
        Node temp = new Node(0);
        Node current = head;
        while(current.next != null){
            if(current.data > current.next.data){
                temp = current;
                current = current.next;
                current.next = temp;
            }
        }
    }
    
    public int lose58(){
        int cnt = 0;
        Node current = head;
        while(current.next != null){
            if(current.data == 58){
                current = null;
                cnt++;
            }
        }
        return cnt;
    }
    public int getEvenCount(){
        int cnt = 0;
        Node current = head;
        while(current.next != null){
            if(current.data % 2 == 0){
                cnt++;
                current = current.next;
            }
            else{
            current = current.next;
            }
        }
        return cnt;
    }
    public void killOdds(){
        Node current = head;
        if(current == null){
            return;
        }
        while(current.next != null){
            if(current.next.data % 2 == 1){
                current.next = current.next.next;
            } else {
            current = current.next;

            }
            
        }
    }
}
