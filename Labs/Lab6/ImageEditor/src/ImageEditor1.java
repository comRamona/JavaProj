import java.awt.Color;


public class ImageEditor1 {
	 public static double luminance(Color color) {
     double luminance=0.299*color.getRed()+0.587*color.getGreen()+0.114*color.getBlue();
	 return luminance; }

public static Color toGrey(Color color){
	int l=(int) Math.round(luminance(color));
	Color gr=new Color(l, l, l);
	return gr;
}


public static Picture makeGreyscale(Picture pic){ Picture g=new Picture(pic.width(), pic.height());
  for(int i=0;i<pic.width();i++)
	  for(int j=0;j<pic.height();j++)
		  g.set(i, j, toGrey(pic.get(i, j)));
  return g;
		
}
    public static void main(String[] args) {
		Picture p=new Picture("butterfly.jpg");
		Picture greyscale=makeGreyscale(p);
		greyscale.show();
		Picture p2=new Picture("lion2.jpg");
		makeGreyscale(p2).show();
	}
    
}
