
public class Vector3D {
	private double x,y,z;
	private double r;

public Vector3D(double x, double y, double z)
{ this.x=x; this.y=y; this.z=z;
}

public double getR()
	{  r=Math.sqrt(x*x+y*y+z*z);
	return r; }

public double getTheta()
	{ return Math.acos(z/getR()); }

public double getPhi()
	{ return Math.atan2(y, x); }

public static Vector3D add(Vector3D lhs, Vector3D rhs)
{ Vector3D sum=new Vector3D(lhs.x+rhs.x,lhs.y+rhs.y,lhs.z+rhs.z);
return sum;}

public static Vector3D subtract(Vector3D lhs, Vector3D rhs)
{ Vector3D dif=new Vector3D(lhs.x-rhs.x,lhs.y-rhs.y,lhs.z-rhs.z);
   return dif;}

public static Vector3D scale( Vector3D v, double scaleFactor){
	return (new Vector3D((v.x)*scaleFactor,(v.y)*scaleFactor,(v.z)*scaleFactor));
	
}
 
public static void main(String[] args) {
	System.out.println(new Vector3D(-10.0,0.0,0.0).getR());
}
}
