
public class ArithmeticSeries {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int s=0;
		int i=1;
		while(i<=n) { s=s+i; i++;}
		System.out.println(s);
	}

}
