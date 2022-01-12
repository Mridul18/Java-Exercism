class RnaTranscription {

    public String transcribe(String dnaStrand) {
        String rnaStrand="";
        for(char ch: dnaStrand.toCharArray())
	    {
		if(ch=='G')rnaStrand+='C';
		else if(ch=='C') rnaStrand+='G';
		else if(ch=='T') rnaStrand+='A';
		else if(ch=='A') rnaStrand+='U';
	    }
	    
	    return rnaStrand;
    }

}