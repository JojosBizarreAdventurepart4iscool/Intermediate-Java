package Q1;
import java.util.*;
import java.io.*;
public class pelican3910 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Generate which term? : ");
            int term = input.nextInt();
            System.out.println("Term#: " + term + " is " + modFib.modFibonacci(term));


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}