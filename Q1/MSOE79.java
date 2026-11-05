import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class MSOE79 {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/problem9.dat"));
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> aList = new ArrayList<Integer>();
            while(file.hasNextInt()){
                   int temp = file.nextInt(); 
                aList.add(temp);
            }
            System.out.println("Enter starting location: ");
            int start = input.nextInt();
            int width = 0;
            System.out.println("Enter width ");
             width = input.nextInt();
             int biggest = 0;
             for(int x = 0; x < aList.size(); x++){
                if(biggest < aList.get(x)){
                    biggest = aList.get(x);
                }
             }
            int MaxB = biggest/width +1;
            String[] arr = new String[MaxB];
            for(int x = 0; x < arr.length; x++) {
                arr[x] = "";
            }
            for(int x = 0; x < aList.size(); x++){
                int binNum = (aList.get(x) - start)/width; 
                arr[binNum] += "*";
                }
            for(int x = 0; x < MaxB; x++){
                System.out.println( (x*width) + " - " + (x*width+width-1) + " " + arr[x]);
            
        }
            

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}