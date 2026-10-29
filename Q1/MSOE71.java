import java.util.Scanner;
public class MSOE71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height of the first object: ");
        double h1 = input.nextInt();
        System.out.println("Enter Length of first object's Shadow: ");
        double l1 = input.nextInt();
        System.out.println("Enter Length of Second object's Shadow: ");
        double l2 = input.nextInt();
        double h2 = (h1/l1)*l2;
        System.out.println(h2);
    }
}
