public class LinkedList<T extends Comparable<T>> {
    private class Node implements Comparable<Node> {
        T data;
        Node next;

        Node(T value){
            data = value;
            next = null;
        }

        public int compareTo(Node o) {return data.compareTo(o.data); }
    }

    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;

    }   
    
    public boolean add(T element){
        var node = new Node(element);
        if(head == null){
            head = node;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
                current.next = node;
            }
        }
        size++;
        return true;
    }

    public T remove(int index){
        T old;
        if(index == 0){
            old = head.data;
            head= head.next;
        }
        else{
        Node current = head;
        for(int x = 0; x < index; x++)current = current.next;
            old = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return old;
    }

    //
}
