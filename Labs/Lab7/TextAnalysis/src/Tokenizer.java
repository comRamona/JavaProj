public class Tokenizer{
private String[] tokens={};
public Tokenizer()
{   }

public Tokenizer(String fname) { tokensFromFile(fname); }
   

public void tokensFromFile(String fname) {
	In file=new In(fname);
	String str=file.readAll();
    tokenize(str);
	
}
   
public void tokenize(String str)
{ tokens=str.split("\\W+"); }

public String[] getTokens()
{ return tokens; }

public int getNumberTokens()
{return tokens.length;  }

public static void main(String[] args) {
	
	Tokenizer t0 = new Tokenizer("melville-moby_dick.txt");
	String[] tokens0 = t0.getTokens();

	//Call tokensFromFile() to read in a file
	Tokenizer t1 = new Tokenizer();
	t1.tokensFromFile("melville-moby_dick.txt");
	String[] tokens1 = t1.getTokens();
	for(String i:tokens1) if(i.equals("mountain"))System.out.println(i);

	//Call tokenize() on a string
	Tokenizer t2 = new Tokenizer();
	String sent = "Together we can change the world.";
	t2.tokenize(sent);
	String[] tokens2 = t2.getTokens();
}
 
}