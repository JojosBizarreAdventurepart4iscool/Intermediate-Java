
import java.util.Scanner;

public class LP521 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first =input.next();
        System.out.println("Enter Last name: ");
        String Last = input.next();
        String temp = Last.toUpperCase();
        int group = 0;
        if(temp.compareTo("J") < 0){
        group = 1;
        }
        else if(temp.compareTo("T") < 0){
            group = 2;
        }
        else {
            group = 3;
        }
        System.out.println(first +" " + Last + " is assigned to group " + group );
        input.close();
    }
}
//Enter first name: 
//Christina
//Enter Last name: 
//Briglio
//hristina Briglio is assigned to group 1
