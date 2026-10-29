
import java.util.Scanner;
public class LP313{
    public static void main(String[] args) {
         double amount = simpleIntrest();
        System.out.println("The value after the term is: " + amount);
        double principal = getPrincipal();
        System.out.println("You need to put in " + principal + " to get your desired amount");
    }

    public static double simpleIntrest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.println("Enter years: ");
        int years = input.nextInt();
        System.out.println("Enter intrest rate ");
        double interestrate = input.nextDouble();
        double amount = principal * (1 + years * interestrate);
        return amount;
    }

    public static double getPrincipal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter desired amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter years: ");
        int years = input.nextInt();
        System.out.println("Enter intrest rate ");
        double interestrate = input.nextDouble();

        double principal = amount / (1 + years * interestrate);
        return principal;

    }

}
//Enter the principal: 
//5000
//Enter years: 
//5
//Enter intrest rate 
//0.06
//The value after the term is: 6500.0
//Enter desired amount: 
//6500
//Enter years: 
//5
//Enter intrest rate 
//0.06
//You need to put in 5000.0 to get your desired amount