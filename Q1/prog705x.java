import java.util.*;
import java.io.File;

public class testingcopy {
    public static void main(String[] args) {
        try {
            Scanner secret = new Scanner(new File("Langdat/prog705x.txt"));

            Scanner file = new Scanner(new File("Langdat/prog512h.dat"));
            ArrayList<Integer> code = new ArrayList<>();
            ArrayList<String> poem = new ArrayList<>();
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
                int letter1 = (linenum*100) + (word*10) - code.get(x);
            }
            
           

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// for (int x = 0; x < code.size(); x++) {
// System.out.println(code.get(x));
//
// }
// for (int x = 0; x < poem.size(); x++) {
// System.out.println(poem.get(x));
// }          
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}