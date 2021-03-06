import java.util.Calendar;


public class CreditCard {
	private int expiryMonth,expiryYear;
	String firstName="",lastName="", ccNumber="";

public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber)

{ if(expiryMonth>=1&&expiryMonth<=12) this.expiryMonth=expiryMonth; else System.out.println("Wrong month format");
  if(expiryYear>999&&expiryYear<=9999) this.expiryYear=expiryYear;  else System.out.println("Wrong year format");
  this.firstName=firstName;
  this.lastName=lastName;
  if(ccNumber.length()==16) this.ccNumber=ccNumber; else System.out.println("ccNumber should have 16 characters"); }


public String formatExpiryDate()
{ return expiryMonth+"/"+(expiryYear%100); } 

public String formatFullName() {
	return firstName+" "+lastName; }

public String formatCCNumber(){if(ccNumber.length()==16) { int length=16;
String formated="";
int i=0;
while(i<length) { formated=formated.concat(ccNumber.substring(i,i+4)); formated=formated.concat(" "); i+=4; } 
return formated.substring(0,formated.length()-1); }
else return "what"; }

public boolean isValid(){
	
	Calendar now=Calendar.getInstance();
	int y=now.get(Calendar.YEAR);
	int m=now.get(Calendar.MONTH);
	if(expiryYear>y) return true;
	else if(expiryYear==y) { if(expiryMonth-1>m) return true; }
	return false; }
   

public String toString() {
	String s="Number: "+formatCCNumber()+"\n"+"Expiration date: "+formatExpiryDate()+"\n"+"Account holder: "+formatFullName()+"\n"+"Is valid: "+isValid();
	return s;
	
}


	public static void main(String[] args) {
	
    	CreditCard cc1 = new CreditCard(10, 2014, "Bob", "Jones", "1234567890123456");
		
		System.out.println(cc1.toString());
		CreditCard cc2 = new CreditCard(2, 2015, "Ana", "Karenina", "1234561234561234");
		System.out.println(cc2.toString());
	}

}
