package TextualAnalysisOfBooks;
/**
 * This class prints out the time analysis results for word frequency excluding words in the stop list.
 * @author Yihan
 *
 */
public class ECComparisonWFSL {

	public static void main(String[] args) {
		String sl="stop-list.txt";
		
		String[] textList={"alice-in-wonderland.txt","christmas-carol.txt",
				   "huck-finn.txt", "les-mis.txt", "metamorphosis.txt", "my-man-jeeves.txt", "pride-prejudice.txt"
				"tale-of-two-cities.txt", "tom-sawyer.txt"};
		
		for(String s:textList){
			WordFrequencyStopList wf=new WordFrequencyStopList(s, sl);
			WordFrequencyStopListB wfB=new WordFrequencyStopListB(s, sl);
			String[] cArr=wf.topFrequentWord();
			String[] cArrB=wfB.topFrequentWord();
			System.out.println("Txt sample: "+s);
			System.out.println("The time for creating a new object for version A and B respectively are: "
				+wf.gettCreate()+", "+wfB.gettCreate());
			System.out.println("The time for adding a new object for version A and B respectively are: "
				+wf.gettAdd()+", "+wfB.gettAdd());
			System.out.println("The time for checking an object for version A and B respectively are: "
				+wf.gettCheck()+", "+wfB.gettCheck());
			System.out.println("The time for updating an object for version A and B respectively are: "
				+wf.gettUpdate()+", "+wfB.gettUpdate());
			System.out.println("The time for getting tops for version A and B respectively are: "
				+wf.gettGetTop()+", "+wfB.gettGetTop());
		}
		
	}

}


