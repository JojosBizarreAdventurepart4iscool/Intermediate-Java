import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;

public class prog602bQueue {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog602b.dat"));
            Queue<Integer> account = new PriorityQueue<Integer>();
            Queue<Double> hours = new PriorityQueue<Double>();
            Queue<Integer> priority = new PriorityQueue<Integer>();
            int cnt = 0;
            System.out.println("Acnt  Hours  code   Amount Due");
            while (file.hasNextLine()) {
                account.add(file.nextInt());
                hours.add(file.nextDouble());
                priority.add(file.nextInt());
                cnt++;
            double cost = 0;
            if (hours.peek() <= 5.0 && priority.peek() == 0) {
                cost = 200;
            } else if (hours.peek() <= 5.0 && priority.peek() == 1) {
                cost = 200 + 50;
            } else if (hours.peek() <= 5.0 && priority.peek() == 2) {
                cost = 200 + 150;
            } else if (hours.peek() < 15.0 && priority.peek() == 0) {
                cost = 200 + (hours.peek() - 5) * 50;
            } else if (hours.peek() < 15.0 && priority.peek() == 1) {
                cost = (200 + (hours.peek() - 5) * 50) + 50;
            } else if (hours.peek() < 15.0 && priority.peek() == 2) {
                cost = (200 + (hours.peek() - 5) * 50) + 150;
            } else if (hours.peek() > 15.0 && priority.peek() == 0) {
                cost = 550 + (hours.peek() - 15) * 30;
            } else if (hours.peek() > 15.0 && priority.peek() == 1) {
                cost = 550 + ((hours.peek() - 15) * 30) + 50;
            } else if (hours.peek() > 15.0 && priority.peek() == 2) {
                cost = 550 + ((hours.peek() - 15) * 30) + 150;
            }
            System.out.println(account.peek() + "  " + hours.peek() + "     " + priority.peek() + "     " + cost);            
            account.remove();
            hours.remove();
            priority.remove();
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
