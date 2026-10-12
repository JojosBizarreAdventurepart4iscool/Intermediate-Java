import java.util.*;
import java.io.File;

public class prog705x {
    public static void main(String[] args) {
        try {
            Scanner secret = new Scanner(new File("Langdat/prog705x.txt"));

            Scanner file = new Scanner(new File("Langdat/prog512h.dat"));
            ArrayList<Integer> code = new ArrayList<>();
            ArrayList<String> poem = new ArrayList<>();
            String answer = "";
            while (secret.hasNextInt()) {
                int temp1 = secret.nextInt();
                code.add(temp1);

            }
            while (file.hasNextLine()) {
                String temp2 = file.nextLine();
                poem.add(temp2);

            }
            for (int x = 0; x < code.size(); x++) {
                int linenum = code.get(x)/100;
                int word = (code.get(x) - (linenum*100))/10;
                int letter1 =code.get(x) - ((linenum*100) + (word*10));
                
                String line = poem.get(linenum-1);
                String[] linearr = line.split(" ");
                String target = linearr[word-1];
                String s = target.substring(letter1-1,letter1);
                answer += s;
            System.out.println(linenum + " " +  word + " " + letter1 + " " + s);
            }
            secret.close();
            file.close();
            
           

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//8 3 1 c
//1 1 2 o
//7 2 2 o
//9 1 4 l
//8 2 1 b
//12 4 3 e
//15 5 1 a
//17 2 4 n
//18 1 6 s