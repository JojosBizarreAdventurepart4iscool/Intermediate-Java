import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pelican526 {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/Marquee.dat"));
            CircularDequeue<String> list = new CircularDequeue<>(1000);

            
            while(file.hasNextLine()){
            int shift = Integer.parseInt(file.nextLine());
            String sequence = file.nextLine();
            String[] arr = sequence.split("");

            for (int x = 0; x < sequence.length(); x++) {
                list.addRear(sequence.substring(x,x+1));
            }
            for(int x = 0; x < shift-1; x++){
                list.addRear(sequence.substring(x,x+1));
                list.deleteFront();
            }
            list.deleteFront();
            list.print40();
            System.out.println();
            list.deleteAll();
        }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}