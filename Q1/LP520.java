package Q1;
import java.util.Scanner;

public class LP520 {
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter text:");
String str = input.nextLine();
int cnt =0;
for(int x = 0; x < str.length(); x++){
    if(str.substring(x,x+1).equals("a")||str.substring(x,x+1).equals("A")){
        cnt++;
    }
    else if(str.substring(x,x+1).equals("e")||str.substring(x,x+1).equals("A")){
        cnt++;
    }
    else if(str.substring(x,x+1).equals("i")||str.substring(x,x+1).equals("I")){
        cnt++;
    }
    else if(str.substring(x,x+1).equals("o")||str.substring(x,x+1).equals("O")){
        cnt++;
    }
    else if(str.substring(x,x+1).equals("u")||str.substring(x,x+1).equals("U")){
        cnt++;
    }
}
System.out.println("The number of vowels in " + str + " is " + cnt);
input.close();
    }
    
}
//Enter text:
//Java Programming Assignment
//The number of vowels in Java Programming Assignment is 8
