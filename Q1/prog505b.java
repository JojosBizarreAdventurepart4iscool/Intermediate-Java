
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class prog505b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505b.dat"));
            ArrayList<String> names = new ArrayList<>();
            ArrayList<int[]> nums = new ArrayList<>();
            int x = 0;
            double t1a = 0;
            double t2a = 0;
            double t3a = 0;
            double t4a = 0;
            double t5a = 0;
            int cnta =0;
            int cntb=0;
            int cntc=0;
            int cntd=0;
            int cntf=0;
            while (file.hasNext()) {
                String first = file.next();
                String last = file.next();
                names.add(first + " " + last);
                int[] temp = new int[5];
                temp[0] = file.nextInt();
                temp[1] = file.nextInt();
                temp[2] = file.nextInt();
                temp[3] = file.nextInt();
                temp[4] = file.nextInt();
                t1a += temp[0];
                t2a += temp[1];
                t3a += temp[2];
                t4a += temp[3];
                t5a += temp[4];
                nums.add(temp);
                double average = (temp[0] + temp[1] + temp[2] + temp[3] + temp[4]) / 5;
                String grade = "";
                if (average >= 90) {
                    grade = "A";
                    cnta++;
                } else if (average >= 80) {
                    grade = "B";
                    cntb++;
                } else if (average >= 70) {
                    grade = "C";
                    cntc++;
                } else if (average >= 60) {
                    grade = "D";
                    cntd++;
                } else {
                    grade = "F";
                    cntf++;
                }
                System.out.print(names.get(x) + " ");
                int[] temparr = nums.get(x);
                for (int y = 0; y < temparr.length; y++) {
                    System.out.print(temparr[y] + " ");
                }
                // nums.get(x)[y] +
                System.out.println(" " + average + " " + grade);
                
                x++;
            }
            t1a = t1a/3;
            t2a = t2a/3;
            t3a = t3a/3;
            t4a = t4a/3;
            t5a = t4a/3;
            System.out.println("Test 1 " + t1a + " " + cnta);
            System.out.println("Test 2 " + t2a + " " + cntb);
            System.out.println("Test 3 " + t3a + " " + cntc);
            System.out.println("Test 4 " + t4a + " " + cntd);
            System.out.println("Test 5 " + t5a + " " + cntf);

            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}