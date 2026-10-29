public class Linerfunction implements Linearfuctionsmethods{
    double slope;
    double yInt;

public Linerfunction(double s , double y){
  slope = s;
  yInt = y;
}

  public double getSlope() {
    return slope;
  }

  public double getYint() {
    return yInt;
  }

  public double getRoot() {
    yInt = yInt*-1;
    double root = yInt/slope;
    return root;
  }

   public double getXValue(double y){
    double x = (y - yInt)/slope;
    return x;
   }

   public double getYValue(double x){
    double y = (slope*x) + yInt;
    return y;
   }

}
