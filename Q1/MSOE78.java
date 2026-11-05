import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MSOE78 {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/problem8.dat"));
            var Scanner = new Scanner(System.in);
            int row = file.nextInt();
            int column = file.nextInt();
            int[][] arry = new int[row][column];
            for(int x = 0; x < row; x++){
                for(int y = 0; y < column; y++){
                    arry[x][y] = file.nextInt();
                }
            }
            for(int x = 0; x < row; x++){
                for(int y = 0; y < column; y++){
                    System.out.print(arry[x][y] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for(int x = 1; x < row-1; x++){
                for(int y = 1; y < column -1; y++){
                    boolean temp = true;
                    if(arry[x][y] < arry[x -1][y -1]){
                        temp = false;
                    }
                    if(arry[x][y] < arry[x+1][y]){
                       temp = false;
                    }
                    if(arry[x][y] < arry[x -1][y +1]){
                        temp = false;
                    }
                    if(arry[x][y] < arry[x][y -1]){
                        temp = false;
                    }
                    if(arry[x][y] < arry[x][y +1]){
                        temp = false;
                    }
                    if(arry[x][y] < arry[x +1][y -1]){
                        temp = false;
                    }
                    if(arry[x][y] < arry[x +1][y +1]){
                        temp = false;
                    }
                    if(temp == true){
                        System.out.println(arry[x][y] + " is one of the highest points");
                    }
                }
            }



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
