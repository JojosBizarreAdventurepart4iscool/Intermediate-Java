import java.util.Scanner;
public class LP33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total =0;
        System.out.print("Books = $200 \t\t Rent per month = $500 \t\t Tuition = $3,000 \t\t Calculators = $30\n");
        System.out.println("How many books?");
        int books = input.nextInt();
        System.out.println("How many months?");
        int rent = input.nextInt();
        System.out.println("How many Calculators?");
        int calculators = input.nextInt();
        books = books * 200;
        rent = rent * 500;
        calculators = calculators * 30;
        total = books + rent + calculators + 3000;
        System.out.println("Enter amount Scholarship money: ");
        Double offsets = input.nextDouble();
        total = total - offsets;
        System.out.println("Your total amont of money needed for this School year is $" + total);
        input.close();
    }
 //   Books = $200             Rent per month = $500           Tuition = $3,000                Calculators = $30
//How many books?
//3
//How many months?
//12
//How many Calculators?
//2
//Enter amount Scholarship money: 
//5000
//Your total amont of money needed for this School year is $4660.0
}
