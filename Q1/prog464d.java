
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog464d {
/**
 * preforms matrix transposition on a 2d array of integers
 * @param mat the 2d array to be tranposed
 * @return Transposition of mat
 */
    public static int[][] transpose(int[][] mat){
        int[][] transpose = new int[mat[0].length][mat.length];
        for(int row =0; row < mat.length; row++ )
    for(int col =0; col<mat[0].length; col++)
        transpose[row][col] = mat[row][col];
    return transpose;
}

    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];
            while (file.hasNext()) {
                for (int r = 0; r < mat.length; r++) {
                    for (int c = 0; c < mat[0].length; c++) {
                        mat[r][c] = file.nextInt();
                    }
                }
            }
            System.out.println("Original");
            var mat_T = transpose(mat);
            for(int[] row : mat){
                for(int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }
            System.out.println("Transpose");
            for(int[] row : mat_T){
                for(int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }
            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
       // Original
//45 67 89 12 -3 
//-3 -6 -7 -4 -9 
//96 81 -8 52 12 
//14 -7 72 29 -1 
//19 43 28 63 87 
//Transpose
//45 67 89 12 -3 
//-3 -6 -7 -4 -9 
//96 81 -8 52 12 
//14 -7 72 29 -1 
//19 43 28 63 87
    }
}
