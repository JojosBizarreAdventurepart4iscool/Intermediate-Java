import java.util.Scanner;
public class MSOE73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 angles: ");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        if(A + B + C == 180){
        System.out.println("please enter the length opposite of the thrid angle ");
        int opp = input.nextInt();
        double r = opp * Math.sin(A/2) * Math.sin(B/2) / ((Math.cos(C/2)));
        System.out.println("The radius of the Circle is: " + r);
    }else{
        System.out.println("Error");
    }
    input.close();
}
}
