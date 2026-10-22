package Q1;
import java.util.*;
import java.io.*;
import java.util.ArrayList; 

public class prog481a{
    public static void main(String[] args) {
        try{
            var file = new Scanner(new File("Langdat/numsort.dat"));
            var nums = new ArrayList<Integer>();

            while(file.hasNext()){
                nums.add(file.nextInt());
            }

            Integer[] arr = new Integer[nums.size()];
            for(int x = 0; x < nums.size(); x++){
                arr[x] = nums.get(x);
            }
            System.out.println("Original List: " + Arrays.toString(arr));
            sortingalgorithms.bubbleSort(arr);
            System.out.println("\nSorted List: " + Arrays.toString(arr));
file.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}