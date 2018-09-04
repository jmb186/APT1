
public class DNAMaxNucleotide {	
	public String max(String[] strands, String nuc) {
		int maxNuc=0;
		String theStrand = "";
        for(int k=0;k<strands.length;k++) {
        	char[] singleStrand = strands[k].toCharArray();
        	int numNuc=0;
        	for (char x:singleStrand) {
        		if (Character.toString(x).equals(nuc)) {
        			numNuc += 1;
        		}
        	}
        	if(numNuc > 0) { 
        		if ((numNuc>maxNuc)||((numNuc==maxNuc)&&(strands[k].length()>theStrand.length())) ) {
        			theStrand = strands[k];
        			maxNuc=numNuc;
        		}
        		}
        	
        }
        return theStrand;
  }
}
