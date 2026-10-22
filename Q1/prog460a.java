package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class prog460a {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/sort.dat"));
            var nums = new ArrayList<Integer>();

            while (file.hasNext()) {
                nums.add(file.nextInt());
            }
            int i = 0;
            var arr = new Integer[nums.size()];
            for (var n : nums) arr[i++] = n;
            int num = 0;
            var input = new Scanner(System.in);
            
            do{
                System.out.println("Enter number to search for: ");
                num = input.nextInt();
                int pos = searchalgorithms.binarySearchRecursive(arr,num);
                System.out.println(pos == -1 ? "Your number isn't in the list\n" : "Your number occurs at index" + (pos+1) + "\n");
            }while(num != 1);
            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


