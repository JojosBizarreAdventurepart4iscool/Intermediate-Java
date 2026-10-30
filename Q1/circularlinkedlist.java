
public class circularlinkedlist<T extends Comparable<T>> implements Iterable<T> {
        private class Node implements Comparable<Node>{
        T data;
        Node prev;
        Node next;

        Node(T data){
            this.data = data;
            prev = null;
            next = null;
        }

        public int compareTo(Node o) {return data.compareTo(o.data);}

    }
    public Node head;
    public int size;

    public circularlinkedlist(){
        head = null;
        size = 0;
    }

    public void add(T element){
        var node = new Node(element);
        if( head == null){
            head = node;
            head.next = head;
        }else{
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
        size++;
    }

    public void remove(int index) {
        if(index < 0 ||  index  >= size) throw new IndexOutOfBoundsException();
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
    public T get(int index){
        if(index < 0 ||  index  >= size) throw new IndexOutOfBoundsException();
        Node current  = head;
        for(int x = 0; x < index; x++){
            current = current.next;
        }
        return current.data;
    }
    public void set(int index, T element){
        if(index < 0 ||  index  >= size) throw new IndexOutOfBoundsException();
        Node current  = head;
        for(int x = 0; x < index; x++){
            current = current.next;
        }
        current.data = element;
    }

    public void print(){
        Node current = head;
        do{
            System.out.println(current.data + " ");
            current = current.next;
        }while(current != head);
        System.out.println();
    }

    public int size() {return size;}
    public boolean isEmpty() {return size ==0; } 

    public Iterator<T> iterator() {
        return new Iterator<>() {
                private Node current = head;
                private int index = 0;

                public boolean hasNext(){return index < size;}

                public T next(){
                    T data = current.data;
                    current = current.next;
                    index++;
                    return data;
                }
            };
         }
}
