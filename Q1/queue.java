public class queue<T extends Comparable<T>> {
    protected T[] queue;
    protected int front;
    protected int rear;
    protected int size;
    protected int capacity;


    public void Queue(){
        size = 0;
        front = 0;
        rear = 0;
        capacity = 0;
        queue = (T[]) new Comparable[capacity];

    }

    public void enqueue(T element){
        if(size == capacity) resize(2* capacity);
        queue[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }

    public T dequeue(){
        T element = queue[front];
        front = (front + 1) % capacity;
        size--;
        if(size == capacity / 4) resize(capacity/2);
        return element;
    }

    public T peek() {return queue[front];}
    public int size() { return size;}
    public boolean isEmpty() { return size ==0;}

    protected void resize(int newCapacity){
        if(newCapacity < 1) newCapacity = 1;
        var newQueue = (T[]) new Comparable[newCapacity];
        for(int x = 0; x < size; x++){
            newQueue[x] = queue[(front +1) % capacity];
        } 
        queue = newQueue;
        capacity = newCapacity;
        front = 0;
        rear = size;
            }

}
