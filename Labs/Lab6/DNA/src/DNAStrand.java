
public class DNAStrand {
	private String dna="";
    public DNAStrand(String dna) {
    	this.dna=dna; }
    
    public boolean isValidDNA() {
    	if(dna.length()==0) return false;
    	for(int i=0;i<dna.length();i++)
    		if("ATCG-".indexOf(dna.charAt(i))<0) return false;
    	return true; }
    public String complementWC() {
    	String dna2="";
    	for(int i=0;i<dna.length();i++) {
    		switch(dna.charAt(i)){
    			case 'A': dna2=dna2.concat("T"); break;
    			case 'T': dna2=dna2.concat("A"); break;
    			case 'C': dna2=dna2.concat("G"); break;
    			case 'G': dna2=dna2.concat("C"); break;
    			case '-': dna2=dna2.concat("-"); break;
    			default: break;
    		} 
    	
    	} 
  
    	return dna2;
    				
    }
    public String palindromeWC() {
    	String compl=complementWC();
    	String pal="";
    	int l=compl.length();
    	for(int i=l-1;i>=0;i--)
    		pal=pal.concat(compl.substring(i,i+1));
    		
    	return pal;
    }
    public boolean containsSequence(String seq) {
    	return dna.contains(seq);
    }
    public String toString() { String s=dna; return s; }
	
	
}
