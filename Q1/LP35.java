import java.util.Scanner;
public class LP35 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter amount of change in Cents ");
        int total = input.nextInt();
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while(total > 0){
            if(total>= 25){
                quarters++;
                total = total-25;
            }
            else if(total>= 10){
                dimes++;
                total = total-10;
            }
            else if(total>= 5){
                nickels++;
                total = total-5;
            }
            else{
                pennies++;
                total=total-1;
            }
        }
        System.out.println("The miminum number of coins needed are");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        input.close();
    }
}
//Enter amount of change in Cents 
//212
//The miminum number of coins needed are
//Quarters: 8
//Dimes: 1
//Nickels: 0
//Pennies: 2
