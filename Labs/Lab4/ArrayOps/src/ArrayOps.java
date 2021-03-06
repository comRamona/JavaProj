import java.util.Arrays;

public class ArrayOps {

    public static double findMax(double[] data) {
        double max=data[0];
        for(int i=1;i<data.length;i++)
        	if(data[i]>max) max=data[i];
        return max;
    }

    public static double[] normalise(double data[]) {
        double sum=0;
        for(int i=0;i<data.length;i++)
        	sum+=data[i];
        double[] c=new double[data.length];
        for(int i=0;i<c.length;i++)
        	c[i]=data[i]/sum;
        return c;
    }

    public static void normaliseInPlace(double data[]) {
        // ADD CODE HERE
    	double sum=0;
        for(int i=0;i<data.length;i++)
        	sum+=data[i];
        for(int i=0;i<data.length;i++)
        	data[i]/=sum;
    }

    public static double[] reverse(double[] data) {
    	int n=data.length;
    	double[] c=new double[n];
        for(int i=0;i<n;i++) 
        	c[i]=data[n-1-i];
        return c;
    }

    public static void reverseInPlace(double[] data) {
    	int n=data.length;
        for(int i=0;i<n/2;i++) 
        	{double aux=data[i];
		    data[i]=data[n-i-1];
		    data[n-i-1]=aux; }
    }

    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE
    	for(int i=0;i<data1.length;i++) {
    		double aux=data1[i];
    		data1[i]=data2[i];
    		data2[i]=aux;
    	}
    }
    public static void main(String[] args) { int N=StdIn.readInt();
    double[] a=new double[N];
    for(int i=0;i<N;i++)
    	a[i]=StdIn.readDouble();
    double[] b=new double[N];
    for(int i=0;i<N;i++)
    	b[i]=StdIn.readDouble(); 
    double[] c=new double[N];
    c=reverse(a);
    for(double i:c)
    	System.out.print(i+" ");
    System.out.println();
    reverseInPlace(a);
    for(double i:a)
    System.out.print(i+" ");
    System.out.println(Arrays.toString(b));
    swap(a,b);
    System.out.println(Arrays.toString(b));
    
    }

}