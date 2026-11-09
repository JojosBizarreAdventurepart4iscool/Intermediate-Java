import java.util.Scanner;
import java.lang.Math;

public class MSOE76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = input.nextInt();
        System.out.println("Enter B value: ");
        int b = input.nextInt();
        System.out.println("Enter number of Trapazoids: ");
        int n = input.nextInt();

        double h = (b-a)/2;
        double temp = 0;
        temp += f(a);
        for(int x = 1; x < n; x++){
        temp += 2*f(a+ x*h);
        }
        temp += f(a+ n*h);
        temp *= h/2;
        System.out.print(temp);
        input.close();
    }

    public static double f(double x) {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }
}