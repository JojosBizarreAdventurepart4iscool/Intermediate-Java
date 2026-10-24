package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class prog482j{
           public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/numSort.dat"));
            ArrayList list = new ArrayList<Integer>();
            while(file.hasNext()){
                list.add(file.nextInt());
            }
            System.out.println("Original:");
            var something = new Integer[list.size()];
            for(int x= 0; x < list.size(); x++){
                something[x] = list.get(x);
                System.out.print(something[x]);
            }

            
            System.out.println("Sorted List");
            sortingalgorithms.insertionSort(something);
                for(int x= 0; x < list.size(); x++){
                System.out.print(something[x]);
            }



            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}