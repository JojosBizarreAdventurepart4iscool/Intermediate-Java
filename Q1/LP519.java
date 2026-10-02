import java.util.Scanner;
public class LP519 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a Scentence");
       String scentence = input.nextLine();
       System.out.println("Enter a String");
       String target = input.next();
       int temp = target.length();
       int cnt=0;
       for(int x = 0; x < scentence.length(); x++){
        if(scentence.substring(x,temp).equals(target)){
            String first = scentence.substring(0,cnt);
            String second = scentence.substring(temp);
            System.out.println(first+second); 
            break;  
        }
        else{
            temp++;
            cnt++;
        }
       }
       input.close();
       
    }
}
//Enter a Scentence
//I really hope you get the interview
//Enter a String
//really
//I  hope you get the interview
