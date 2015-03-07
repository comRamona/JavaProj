import java.util.ArrayList;

public class Dalek3{
	private ArrayList<String> s=new ArrayList<String>();
	public void setSayings(String[] s) {for(int i=0;i<s.length;i++) this.s.add(s[i]); }
	public void addSaying(String y) {s.add(y); }
public void speak() { if(s.size()>0) System.out.println(s.get((int)(Math.random()*s.size()))); else System.out.println("No utterances installed!"); }
public static void main(String[] args) {

    Dalek3 d1 = new Dalek3();

    
    String[] u1={"Exterminate, Exterminate!", "I obey!",
            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
            "Daleks do not feel fear.", "The Daleks must survive!"};
    d1.setSayings(u1);
 
    //d1.addSaying("Yo!");

    System.out.println("\nDalek d1 says: ");
    for (int i = 0; i < 10; i++) {
        d1.speak();
    }

    System.out.println("\nDalek d2 says: ");
    Dalek3 d2 = new Dalek3();
    String[] u2 = { "I obey!" };
    d2.setSayings(u2);
    

    for (int i = 0; i < 10; i++) {
        d2.speak();
    }

}
}