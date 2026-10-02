import java.util.Scanner;

public class LP521 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first =input.next();
        System.out.println("Enter Last name: ");
        String Last =input.next();
        int group = 0;
        if(Last.substring(0,1).equals("A")){
        group = 1;
        }
        if(Last.substring(0,1).equals("J")){
            group = 2;
        }
        if(Last.substring(0,1).equals("T")){
            group = 3;
        }
        System.out.println(first +" " + Last + " is assigned to group " + group );
    }
}
