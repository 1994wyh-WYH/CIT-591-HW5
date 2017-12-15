package TextualAnalysisOfBooks;

public class ECComparisonLP {

	public static void main(String[] args) {
		String[] textList={"alice-in-wonderland.txt","christmas-carol.txt",
				   "huck-finn.txt", "les-mis.txt", "metamorphosis.txt", "my-man-jeeves.txt", "pride-prejudice.txt"
				"tale-of-two-cities.txt", "tom-sawyer.txt"};
		
		for(String s:testList){
			LongestParagraphs p=new LongestParagraphs(s);
			LongestParagraphsB pB=new LongestParagraphsB(s);
			String[] cArr=p.getLongestParagraphs();
			String[] cArrB=pB.getLongestParagraphs();
			System.out.println("Txt sample: "+s);
			System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
			System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
			System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		}
		

	}

}
