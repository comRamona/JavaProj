public class NbyN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=StdIn.readInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i==j) a[i][j]=i; else a[i][j]=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) 
				System.out.print(a[i][j]+" ");
			System.out.println();}
		
		

	}

}
