import java.util.*;
import java.io.*;
public class pelican378 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("What is the slope of the line?: ");
    double slope = reader.nextDouble();

    System.out.println("What is the slope of the line?: ");
    double yInt = reader.nextDouble();

    Linerfunction line = new Linerfunction(slope, yInt);

    System.out.println("Slope of this line is: " + line.getSlope());
    
  }  
}
