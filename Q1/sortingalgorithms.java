package Q1;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings({"unchecked, unused, ManualArrayCopy"})
public class sortingalgorithms{
public static <T extends Comparable<T>> void swap(T[] arr, int i , int j){
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static <T extends Comparable<T>> void bubbleSort(T[] arr){
for (int x = 0; x  < arr.length-1; x++ ){
 for(int y = 0; y < arr.length-x-1; y++){
    if(arr[y].compareTo(arr[y+1]) > 0){
    swap(arr,y,y+1);
    }
 }

}
}

public static <T extends Comparable<T>> void insertionSort(T[] arr){insertionSort(arr,arr.length);}
public static <T extends Comparable<T>> void insertionSort(T[] arr, int n){
for( int x = 1; x < n; x++){
    T key =arr[x];
    int y = x-1;
    while( y >= 0 && arr[y].compareTo(key) > 0){
        arr[y+1] = arr[y];
        y--;
    }
    arr[y+1] = key;

}
}
public static <T extends Comparable<T>> void selectionSort(T arr[]){
    //TO DO
}

public static <T extends Comparable<T>> void shellSort(T arr[]){
    //To DO
}
}

