
public class SplitPathName {
	public static String[] splitPath(String s) {
		String[] components=new String[4];
		if(s.lastIndexOf('/')>0) components[0]=s.substring(0,s.lastIndexOf('/')+1);
		else components[0]="";
		if(s.lastIndexOf('/')>=0) components[1]=s.substring(s.lastIndexOf('/')+1);
		else components[1]=s;
		if(components[1].lastIndexOf('.')>0) components[2]=components[1].substring(0,components[1].lastIndexOf('.'));
		else components[2]=components[1];
		if(components[1].lastIndexOf('.') >=0)components[3]=components[1].substring(components[1].lastIndexOf('.'));
		else components[3]="";
		return components;
		
	}
public static void main(String[] args) {
	int N=args.length;
	for(int i=0;i<N;i++)
	{ String[] components=splitPath(args[i]);
	 System.out.printf("File: %s Type: %s [%s]",components[1],components[3],components[0]);
	 System.out.println();
	}
		
	
}
}
