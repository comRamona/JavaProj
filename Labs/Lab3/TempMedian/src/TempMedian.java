import java.util.Arrays;


public class TempMedian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int [] val=new int[args.length];
		val[0]=n;
		for(int i=1;i<args.length;i++){
			switch(args[i]) {
			case "+": {n+=1; val[i]=n; } break;
			case "-": {n-=1; val[i]=n;} break;
			case ".": val[i]=n; break;
			default: break;
			} }
		for(int i=0;i<args.length;i++) {
			System.out.print(val[i]);
			  if(i<args.length-1) System.out.print(" "); }
		System.out.println();
		Arrays.sort(val);
		for(int i=0;i<args.length;i++)
			{ System.out.print(val[i]);
			  if(i<args.length-1) System.out.print(" ");
			}
		System.out.println();
		double m=0;
		int l=val.length;
		if(l%2!=0) m=val[l/2];
		else
			m=((double) (val[l/2]+val[l/2-1]))/2;
		System.out.println(m);
		

	}

}
