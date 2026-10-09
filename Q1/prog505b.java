import java.util.Scanner;
import java.io.File;

public class prog505b{
    public static void main(String[] args) {
    Scanner file = new Scanner(new File("Langdat/prog505d.dat"));
    int[][] array =  new int[4][4];
    for(int x = 0; x < 4; x++){
        for(int y = 0; y < 4; y++){
            array[x][y] = file.nextInt();
        }
    }
    

    }
}