public class OneTimePadDecipher{
public static String decipher(String encipheredText, String onetimepad) {
     String dec=new String();
     if(onetimepad.length()<encipheredText.length()) onetimepad.concat(encipheredText);
	for(int i=0;i<encipheredText.length();i++)
	{char c=encipheredText.charAt(i);
	 char d=onetimepad.charAt(i);
	 if(c==' ') dec=dec+' ';
	 if(OneTimePadEncipher.isAlpha(c)&&OneTimePadEncipher.isAlpha(d)) dec=dec+OneTimePadEncipher.intToChar(((OneTimePadEncipher.charToInt(c)-OneTimePadEncipher.charToInt(d)+26)));
	}
	return dec.toUpperCase();
}
public static void main(String[] args) {
	String enc="uvufsghktdal";
	String key="WHATSTHEPASSWORD";
	System.out.println(decipher(enc,key));
	System.out.println(decipher("wconlahzgzgleuai","YOULLNEVERREADMYONETIMEPAD"));
 	key="KEEPMEVERYVERYSAFE"; 	
 	enc="sw itmn jcxyic";
 	System.out.println(decipher(enc,key));
}
}