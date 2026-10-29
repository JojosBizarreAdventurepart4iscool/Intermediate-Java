
import java.util.*;
public class pelican3910 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Generate which term? : ");
            int term = input.nextInt();
            System.out.println("Term#: " + term + " is " + modFib.modFibonacci(term));
input.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}