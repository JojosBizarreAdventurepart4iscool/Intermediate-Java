import java.util.Scanner;

public class prog52a {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length ");
int length = input.nextInt();
System.out.println("Enter Width ");
int width = input.nextInt();
int area = length * width;
int perimeter = (2*length) + (2*width);
System.out.println(area + " is the area");
System.out.println(perimeter + " is the perimeter");
input.close();
    }
//Enter length 
//5
//Enter Width 
//10
//50 is the area
//30 is the perimeter
}
