import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class prog505b{
    public static void main(String[] args) {
        try{
    Scanner file = new Scanner(new File("prog505b.dat"));
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> nums = new ArrayList<>();
    while(file.hasNext()){
        names.add(file.next());
        nums.add(file.nextInt());
    }
    System.out.println(names);
    System.out.println(nums);
}catch(Exception e){
    System.out.println(e);
}
    

    }
}