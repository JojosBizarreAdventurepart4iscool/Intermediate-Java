import java.util.Scanner;
public class LP313{
    public static void main(String[] args) {
        double amount = simpleIntrest();
        double principal = getPrincipal();
        System.out.println("The value after the term is: " + amount);
        System.out.println("You need to put in " + principal + " to get your desired amount");
        
    }

    public static double simpleIntrest(){
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

    public static double getPrincipal(){
        Scanner input = new Scanner(System.in);
    System.out.println("Enter desired amount: ");
        double amount = input.nextDouble();
         System.out.println("Enter years: ");
       int  years = input.nextInt();
        System.out.println("Enter intrest rate ");
       double interestrate = input.nextDouble();

        doubleprincipal = amount / (1 + years * interestrate);
        return principal;
 }
}