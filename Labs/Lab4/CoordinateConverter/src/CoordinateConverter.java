import java.util.Scanner;
public class CoordinateConverter {

	    public static double convertXYtoR(double x, double y) {
	    	double R=Math.sqrt(x*x+y*y);
	    	return R;
	    }

	    public static double convertXYtoT(double x, double y) {
	    	double T=Math.atan2(y,x);
	    	return T;
	    }

	    public static double convertRTtoX(double r, double theta) {
	    	double x=r*Math.cos(theta);
	    	return x;
	    }

	    public static double convertRTtoY(double r, double theta) {
	    	double y=r*Math.sin(theta);
	    	return y;
	    }

	    public static double convertDegToRad(double deg) {
	    	double rad=(deg*Math.PI)/180;
	    	return rad;
	    }

	    public static double convertRadToDeg(double rad) {
	        double deg=(rad*180)/Math.PI;
	        return deg;
	    }
      public static void main(String[] args) 
      {
    	  Scanner s=new Scanner(System.in);
    	  double x=s.nextDouble();
    	  double y=s.nextDouble();
    	  s.close();
    	  System.out.println(convertXYtoT(x,y));
      }
      

}
