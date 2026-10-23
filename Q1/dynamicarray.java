package Q1;
import java.util.*;
@SuppressWarnings({"unchecked", "unused", "rawTypes"})
public class dynamicarray<T extends Comparable<T>> implements Iterable<T>{
    private T[] array;
    private int size;
    private int capacity; 
    private static final int DEFAULT_CAPACITY = 16;

    public dynamicarray() {
        size = 0; 
        capacity = DEFAULT_CAPACITY;
        array = (T[]) new Comparable[capacity];

    }
    private void resize(int newCapacity){
var newArray = (T[]) new Comparable[newCapacity];
if(size >= 0){
    System.arraycopy(array, 0, newArray, 0, size);
    array = newArray;
    capacity = newCapacity;
}

    }
public void add(T element){
    if(size == capacity) resize(2*capacity); 
    array[size++] = element; //equal to array[size] - element; size++;
}

public T remove(int index) {
    T element = array[index];
    for(int x = index; x < size-1; x++)
array[x] = array[x+1];
size--;
if(size == capacity/4){
    resize(capacity/2);
}
return element;
}

public T get(int index)                   {return array[index];}
    public void set(int index, T element) { array[index] = element;}
    public int size()                     { return size;}
    public boolean isEmpty()              {return size == 0;}
    public int indexOf(T element)         {return searchalgorithms.linearSearch(array, element);}
    public boolean contains(T element)    {return indexOf(element) != -1; }
    public void sort() {sortingalgorithms.insertionSort(array,size);} // replace with quick sort
    public Comparable[] toArray()         {return Arrays.copyOf(array, size);}
    public String toString()              {return Arrays.toString(this.toArray());}


    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;
            public boolean hasNext() {return index < size;}
            public T next() { return array[index++];}
        };
    }
}




