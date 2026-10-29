import java.util.*;

public class pelican427 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> arrayList = new ArrayList<>();
        System.out.println("Please enter name: ");
        String name = input.next();
        ListIterator a = arrayList.listIterator();
        while (!name.equals("EXIT")) {
            System.out.println("Enter how much to deposit: ");
            Double cash = input.nextDouble();
            System.out.println();
            BankAccount newAccount = new BankAccount(name, cash);
            arrayList.add(newAccount);
            System.out.println();
            System.out.println("Please enter name: ");
            name = input.next();
        }
        BankAccount biggest = arrayList.get(0);
        double biggestBalance = biggest.balance;
        String biggestName = biggest.name;
        for(int x =1; x < arrayList.size(); x++){
            if(biggestBalance < arrayList.get(x).balance){
                biggestBalance = arrayList.get(x).balance;
                biggestName = arrayList.get(x).name;
            }
        }
        System.out.println("The account with the biggest money is " + biggestName);
        System.out.println("The account has " + biggestBalance);
    }
}
