import java.util.*;
import java.io.*;

public class prog1071h {
    public static void main(String[] args) {
        try {
            var beginning = new Scanner(new File("Langdat/bginvtry.txt"));
            var list = new Scanner(new File("Langdat/buysell.txt"));
            ArrayList<QueueStackhelper> id = new ArrayList<>();
            while (beginning.hasNext()) {
                var q = new QueueStackhelper();
                q.buy(beginning.nextInt(), beginning.nextInt(), beginning.nextDouble());
                id.add(q);

            }
            while (list.hasNext()) {
                String input = list.next();
                if (input.equals("B")) {
                    int code = list.nextInt();
                    int quantity = list.nextInt();
                    Double cost = list.nextDouble();
                    id.get(code - 1).buy(code, quantity, cost);
                } else {
                    int code = list.nextInt();
                    int quantity = list.nextInt();
                    id.get(code - 1).sell(code, quantity);
                }

            }
                for (int x = 0; x < 10; x++) {
                   id.get(x).printAll();
                        System.out.println();
                }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
