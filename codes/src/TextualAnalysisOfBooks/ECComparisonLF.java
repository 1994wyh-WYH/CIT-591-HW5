package TextualAnalysisOfBooks;
/**
 * This class prints out the time analysis results for letter frequency.
 * @author Yihan
 *
 */
public class ECComparisonLF {

	public static void main(String[] args) {
	
		String[] textList={"alice-in-wonderland.txt","christmas-carol.txt",
				   "huck-finn.txt", "les-mis.txt", "metamorphosis.txt", "my-man-jeeves.txt", "pride-prejudice.txt"
				"tale-of-two-cities.txt", "tom-sawyer.txt"};
		
		for(String s:textList){
			LetterFrequency lf=new LetterFrequency(s);
			LetterFrequencyB lfB=new LetterFrequencyB(s);
			char[] cArr=lf.topFrequentLetter();
			char[] cArrB=lfB.topFrequentLetter();
			System.out.println("Txt sample: "+s);
			System.out.println("The time for creating a new object for version A and B respectively are: "
				+lf.gettCreate()+", "+lfB.gettCreate());
			System.out.println("The time for adding a new object for version A and B respectively are: "
				+lf.gettAdd()+", "+lfB.gettAdd());
			System.out.println("The time for checking an object for version A and B respectively are: "
				+lf.gettCheck()+", "+lfB.gettCheck());
			System.out.println("The time for updating an object for version A and B respectively are: "
				+lf.gettUpdate()+", "+lfB.gettUpdate());
			System.out.println("The time for getting tops for version A and B respectively are: "
				+lf.gettGetTop()+", "+lfB.gettGetTop());
		}
		
		
	}

}
