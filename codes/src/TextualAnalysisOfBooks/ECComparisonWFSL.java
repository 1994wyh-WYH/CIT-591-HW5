package TextualAnalysisOfBooks;
/**
 * This class prints out the time analysis results for word frequency excluding words in the stop list.
 * @author Yihan
 *
 */
public class ECComparisonWFSL {

	public static void main(String[] args) {
		String sl="stop-list.txt";
		String s="alice-in-wonderland.txt";
		
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
		
		
		s="christmas-carol.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="huck-finn.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="les-mis.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="metamorphosis.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="my-man-jeeves.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="pride-prejudice.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="tale-of-two-cities.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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
		
		s="tom-sawyer.txt";
		
		wf=new WordFrequencyStopList(s, sl);
		wfB=new WordFrequencyStopListB(s, sl);
		cArr=wf.topFrequentWord();
		cArrB=wfB.topFrequentWord();
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


