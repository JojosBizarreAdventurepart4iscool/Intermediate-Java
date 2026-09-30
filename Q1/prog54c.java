import java.util.Scanner;

public class prog54c {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Enter radius ");
        double radius = input.nextDouble();
        final double PI = 3.14159;

        double area = PI * Math.pow(radius, 2);
        double circumefrence = 2 * PI * radius;

        System.out.printf("Area: %.3f\n", area);
        System.out.printf("Circumefrence: %.3f\n", circumefrence);
//Enter radius 3.172
//Area: 31.609
//Circumefrence: 19.930 
input.close();
    }
}
