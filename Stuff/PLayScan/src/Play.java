import javax.swing.*;
import java.io.*;
public class Play {
 public static void main(String[] args) throws IOException {
int n=(int) (Math.random()*(100-1))+1;
int p=0;
String getN=JOptionPane.showInputDialog("Enter a number between 1 and 100","Lucky number");
p=Integer.parseInt(getN); 
while(p!=n) {if(n<p) { String w="big"; JOptionPane.showMessageDialog(null, "Your number is too "+w,"Wrong",JOptionPane.WARNING_MESSAGE);
getN=JOptionPane.showInputDialog("Lucky number","Enter a smaller number");}
else { JOptionPane.showMessageDialog(null, "Your number is too small","Wrong!",JOptionPane.WARNING_MESSAGE, null);
getN=JOptionPane.showInputDialog("Enter a bigger number","Lucky number"); }
p=Integer.parseInt(getN); 
}
JOptionPane.showMessageDialog(null,"It was "+p+"! You won!!!!!");
}
}