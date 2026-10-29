import java.util.Scanner;
import java.io.File;

public class prog1061h {
    public static void main(String[]args){
        try{
        Scanner file = new Scanner(new File("Langdat/prg1061h.dat"));
        nodehelper1061h list = new nodehelper1061h();
        while(file.hasNext()){
        String s = file.next();
        
        if (s.substring(0, 1).equals("A")) {
            list.add(s.substring(1));
        }
        else if(s.substring(0,1).equals("D")){
           String target = s.substring(1);
            list.delete(target);
        }
        else if(s.substring(0,1).equals("P")){
            System.out.println(list.print());
        }
        
        else{
            System.out.println("Stupid");
        }
    }
    file.close();
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
