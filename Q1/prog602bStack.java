import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class prog602bStack {
    public static void main(String[] args) {
            try {
            var file = new Scanner(new File("Langdat/prog602b.dat"));
            Stack<Integer> account = new Stack<Integer>();
            Stack<Double> hours = new Stack<Double>();
            Stack<Integer> priority = new Stack<Integer>();
            while(file.hasNextLine()){
                account.push(file.nextInt());
                hours.push(file.nextDouble());
                priority.push(file.nextInt());
                double cost = 0.0;
                
                if(hours.peek() <= 5.0 && priority.peek() == 0){
                    cost = 200;
                }
                else if(hours.peek() <= 5.0 && priority.peek() == 1){
                    cost = 200 + 50;
                }
                else if(hours.peek() <= 5.0 && priority.peek()==2){
                    cost = 200 + 150;
                }
                else if(hours.peek() < 15.0 && priority.peek() ==0 ){
                    cost = 200 + (hours.peek() - 5) * 50;
                }
                else if(hours.peek() < 15.0 && priority.peek() ==1 ){
                    cost = (200 + (hours.peek() - 5) * 50) + 50;
                }
                else if(hours.peek() < 15.0 && priority.peek() ==2){
                    cost = (200 + (hours.peek() - 5) * 50)+150;
                }
                else if(hours.peek() > 15.0 && priority.peek() ==0 ){
                    cost = 550 + (hours.peek() - 15) * 30;
                }
                else if(hours.peek() > 15.0 && priority.peek() ==1 ){
                    cost = 550 + ((hours.peek() - 15) * 30) + 50;
                }
                else if(hours.peek() > 15.0 && priority.peek() ==2 ){
                    cost = 550 + ((hours.peek() - 15) * 30) + 150;
                }

                System.out.println(account + " " + hours + " " + priority + " " + cost);
                account.pop();
                hours.pop();
                priority.pop();
            }
            file.close();


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}