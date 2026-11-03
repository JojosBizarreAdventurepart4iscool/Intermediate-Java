import java.util.*;
import java.io.*;
public class MSOE79 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/problem9.dat"));
            Scanner input = new Scanner(System.in);
            int width = 0;
            System.out.println("Enter width ");
             width = input.nextInt();
             int biggest = 9;
            while(file.hasNextInt()){
               if(biggest < file.nextInt()){
               }
            }
            int bins = biggest/width +1;
           // for(int x = 0; x < bins; x++){
               
            //}

               for(int y = 0; y < biggest; y = y + 2){
                  System.out.println(y + " - " + (y + 1));
               }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 // Things that don't work: Biggest number, creating cnts for the bins.
