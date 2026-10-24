package Q1;

import java.util.Iterator;

public class intlinkedlists implements Iterable<Integer>{
    private class Node{
        int data;
        Node next; //Pointer to next node



        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head; //root of the list
    public intlinkedlists() {head = null;}
    public void addFront(int data) {
        var node = new Node(data);
        node.next = head;
        head = node;
    }
    public void addLast(int data){
        var node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        var current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void print(){
        Node current = head; 
        while(current != head){
            System.out.print(current.data + " ");
            current = current.next;
    }
        System.out.println();
    }

    public Iterator<Integer> iterator(){
        return new Iterator<>() {
            private Node current = head;

            public boolean hasNext() {return current != null;}

            public Integer next(){
            int data = current.data;
            current = current.next;
            return data;
            }
        };
    }

}
//to do: rest of the methods in big linked list