import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;

public class prog1060bQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ExitY = false;
        Queue<Integer> list = new PriorityQueue<>();
        while (ExitY == false) {
            System.out.println("Enter task: (A)dd (D)elet (E)xit");
            String task = input.next();
            if(task.equals("E")){
                ExitY = true;
                System.out.println("This is the List: ");
                System.out.println(list);
                System.out.println("");
            }
            else if(task.equals("A")){
                System.out.println("Enter Number: ");
                int target = input.nextInt();
                list.add(target);
                System.out.println("This is the List: ");
                System.out.println(list);
                System.out.println("");
            }
            else if (task.equals("D")) {
                System.out.println("Enter Number: ");
                int target = input.nextInt();
                list.remove(target);
                System.out.println("This is the List: ");
                System.out.println(list);
                System.out.println("");
            }
        }
        input.close();
    }
}
//Delete swaps some numbers in list