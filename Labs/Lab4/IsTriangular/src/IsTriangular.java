
public class IsTriangular {

	/**
	 * @param args
	 */
	public static boolean isTri(double a,double b,double c)
	{if((a>=(b+c))||(b>=(a+c))||(c>=(a+b))) return false;
	return true; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double a=StdIn.readDouble();
     double b=StdIn.readDouble();
     double c=StdIn.readDouble();
     System.out.println(isTri(a,b,c));
	}

}
