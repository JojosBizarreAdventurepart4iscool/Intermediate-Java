public class Dequeuelab {
    public static void main(String[] args) {
    var deq = new Dequeue<Integer>();
    for(int x = 0; x < 10; x++){
        deq.enqueueFront(x);
    }        
    for(int x = 10; x < 20; x++){
        deq.enqueueRear(x);
    }

    System.out.println(deq.size());
    System.out.println(deq.peekFront());
    System.out.println(deq.peekRear());
    System.out.println(deq.dequeueFront());
    System.out.println(deq.dequeueRear());
    System.out.println(deq.size());
    var rand = new java.util.Random(42);
for(int x = 0; x < 50; x++){
    deq.enqueueFront(rand.nextInt(50));
}
for(int x = 0; x < 48; x++){
    deq.dequeueFront();
}

System.out.println("New size " + deq.size());
System.out.println(deq.peekFront());
System.out.println(deq.peekRear());

    }
}
