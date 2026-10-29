import java.util.*;
import java.io.*;
public class pelican378 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("What is the slope of the line?: ");
    double slope = reader.nextDouble();

    System.out.println("What is the yInt of the line?: ");
    double yInt = reader.nextDouble();

    Linerfunction line = new Linerfunction(slope, yInt);

    System.out.println("Slope of this line is: " + line.getSlope());
    System.out.println("Y Intercept of this line is: " + line.getYint());
    System.out.println("Root of this line is: " + line.getRoot());
    System.out.println("What is an X value you want to solve for Y: ");
    double x = reader.nextDouble();
    double yValue = line.getYValue(x);
    System.out.println("The Y value corresponding to X = " + x + " is " + yValue);
    System.out.println("What is an Y value you want to solve for X: ");
    double y = reader.nextDouble();
    double xValue = line.getXValue(y);
    System.out.println("The X value corresponding to Y = " + y + " is " + xValue);
  }  
}
