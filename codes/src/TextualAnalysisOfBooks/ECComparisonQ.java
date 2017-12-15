package TextualAnalysisOfBooks;
/**
 * This class prints out the time analysis results for quotes.
 * @author Yihan
 *
 */
public class ECComparisonQ {

	public static void main(String[] args) {
		String[] textList={"alice-in-wonderland.txt","christmas-carol.txt",
				   "huck-finn.txt", "les-mis.txt", "metamorphosis.txt", "my-man-jeeves.txt", "pride-prejudice.txt"
				"tale-of-two-cities.txt", "tom-sawyer.txt"};
		
		for(String s:textList){
			TopQuotes q=new TopQuotes(s);
			TopQuotesB qB=new TopQuotesB(s);
			String[] cArr=q.topQuotes();
			String[] cArrB=qB.topQuotes();
			System.out.println("Txt sample: "+s);
			System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
			System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
			System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		}
		

	}

}
