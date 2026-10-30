
public class doublelylinkedlists<T extends Comparable<T>> implements Iterable<T> {
    private class Node implements Comparable<Node>{
        T data;
        Node prev;
        Node next;

        Node(T data){
            this.data = data;
            prev = null;
            next = null;

        }
        public int compareTo(Node o) { return  data.compareTo(o.data);}
    }
        private Node head;
        private Node tail;
        private int size;
        
        public void doublelylinkedlists(){
            head = null;
            tail = null;
            size = 0;
        }

        public void add(T element){
            var temp = new Node(element);
            if(head == null){
                head = temp;
            } else{
                tail.next = temp;
                temp.prev = tail;
            }
            tail = temp;
            size++;
        }

        public void addFront(T element){
            var temp = new Node(element);
            if(head !=null){
                temp.next = head;
                head.prev = temp;
            }
            head = temp;
            size++;
        }

        public T get(int index){
            if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
            Node current = head;
            for(int x = 0; x <index; x++){
                current = current.next;
            }
            return current.data;
        }
        
        public void print(){
            for(Node current = head; current != null; current = current.next){
                System.out.println(current.data + " ");
            }
            System.out.println();
        }

        public void printReverse(){
            for(Node current = tail; current != null; current = current.prev){
                System.out.println(current.data + " ");
            }
            System.out.println();
        }

        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size ==0;
        } 
       public Iterator<T> iterator() {
        return new Iterator<>() {
                private Node current = head;
                public boolean hasNext(){
                    return current != null;
                }
                public T next(){
                    T data = current.data;
                    current = current.next;
                    return data;
                }
               
            };
         }
    }
