import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pelican526 {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/Marquee.dat"));
            CircularDequeue<String> list = new CircularDequeue<>(1000);

            int shift = file.nextInt();
            String sequence = file.nextLine();
            sequence = file.nextLine();
            for (int x = 0; x < sequence.length(); x++) {
                String[] arr = sequence.split("");
                list.addFront(sequence);
            }
            

            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}