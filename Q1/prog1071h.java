import java.util.*;
import java.io.*;

public class prog1071h{
    public static void main(String[] args) {
                try {
            var beginning = new Scanner(new File("Langdat/bginvtry.txt"));
            var list = new Scanner(new File("Langdat/buysell.txt"));
            ArrayList<QueueStack> id = new ArrayList<>(); 
            while (beginning.hasNext()) {
               id.add(new QueueStack(beginning.nextInt(), beginning.nextInt(), beginning.nextDouble()));
            }
            while(list.hasNext()){
                String input = list.next();
                if(input.equals("B")){
                    int code = list.nextInt();
                    int quantity = list.nextInt();
                    Double cost = list.nextDouble();
                    id.get(code-1).buy(code, quantity, cost);
                }
                else{
                    int code = list.nextInt();
                    int quantity = list.nextInt();
                    id.get(code-1).sell(code,quantity);
                }
            }
            for(int x = 0; x < 10; x++){
                System.out.println(id.get(x).peek());
            }

            
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

