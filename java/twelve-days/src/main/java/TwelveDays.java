import java.util.*;
class TwelveDays {
    List<String> giftsReceived= new ArrayList<String>();
    TreeMap<Integer,String> daystowords =new TreeMap<Integer,String>();

    TwelveDays()
    {
	addGifts();
	addDays();
    }

    void addGifts(){
    giftsReceived.add("a Partridge in a Pear Tree");
    giftsReceived.add("two Turtle Doves");
	giftsReceived.add("three French Hens");
	giftsReceived.add("four Calling Birds");
	giftsReceived.add("five Gold Rings");
	giftsReceived.add("six Geese-a-Laying");
	giftsReceived.add("seven Swans-a-Swimming");
	giftsReceived.add("eight Maids-a-Milking");
	giftsReceived.add("nine Ladies Dancing");
	giftsReceived.add("ten Lords-a-Leaping");
	giftsReceived.add("eleven Pipers Piping");
	giftsReceived.add("twelve Drummers Drumming");
   }

   void addDays(){
        daystowords.put(1,"first");
        daystowords.put(2,"second");
        daystowords.put(3,"third");
        daystowords.put(4,"fourth");
        daystowords.put(5,"fifth");
        daystowords.put(6,"sixth");
        daystowords.put(7,"seventh");
        daystowords.put(8,"eighth");
        daystowords.put(9,"ninth");
        daystowords.put(10,"tenth");
        daystowords.put(11,"eleventh");
        daystowords.put(12,"twelfth");
   }
    String verse(int verseNumber) {
	String verseParticularDay="On the "+daystowords.get(verseNumber)+" day of Christmas my true love gave to me: ";
	for(int i=verseNumber-1;i>=0;i--)
	{
           if(i==0)verseParticularDay+=(giftsReceived.get(i)+'.'+'\n');
           else if(i==1) verseParticularDay+=(giftsReceived.get(i)+", and ");
           else verseParticularDay+=(giftsReceived.get(i)+", ");
	}
	
       return verseParticularDay; 
        
    }

    String verses(int startVerse, int endVerse) {
        String verseFromOneDayToAnother="";
        for(int i=startVerse;i<=endVerse;i++)
	{
           verseFromOneDayToAnother+=verse(i);
           if(i!=endVerse)
           verseFromOneDayToAnother+='\n';

	}

	return verseFromOneDayToAnother;
		
    }
    
    String sing() {
       return verses(1,12);
		
    }
}



