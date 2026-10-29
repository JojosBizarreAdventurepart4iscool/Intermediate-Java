import java.util.Scanner;

public class MSOE72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        int cnt = 0;
        for(int x = 0; x < word.length(); x++){
            if(word.substring(x,x+1).equals("a") || word.substring(x,x+1).equals("e") || word.substring(x,x+1).equals("i") || word.substring(x,x+1).equals("o") || word.substring(x,x+1).equals("u")|| word.substring(x,x+1).equals("A") || word.substring(x,x+1).equals("E") || word.substring(x,x+1).equals("I") || word.substring(x,x+1).equals("O") || word.substring(x,x+1).equals("U")){
                cnt++;
            }
        }
        System.out.println(cnt);
        input.close();
    }
}
