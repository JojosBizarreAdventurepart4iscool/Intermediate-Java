package Q1;
import java.util.Scanner;
public class prog82a {
    static class CL82a {
private int limit;
private int speed;
private double fine =0;
private static final int base = 20;
public CL82a(int limit, int speed){
    this.limit = limit;
    this.speed = speed;
}
public void calc(){
    if(speed > limit){
        fine = base + (speed - limit) *5;
    }
}
public double getFine(){ return fine; }
        }
    public static void main(String[] args) {
       var input = new Scanner(System.in);
       System.out.println("Enter the speed limit: ");
       int speedlimit = input.nextInt();
       System.out.println("Enter veichle speed: ");
       int carspeed = input.nextInt();
       var ticket = new CL82a(speedlimit, carspeed);
       ticket.calc();
       System.out.printf("Fine: $%.2f\n", ticket.getFine());
        input.close();


    }
}
//Enter the speed limit: 
//30
//Enter veichle speed: 
//42
//Fine: $80.00