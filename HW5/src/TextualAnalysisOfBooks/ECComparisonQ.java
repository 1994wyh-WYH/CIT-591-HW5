package TextualAnalysisOfBooks;
/**
 * This class prints out the time analysis results for quotes.
 * @author Yihan
 *
 */
public class ECComparisonQ {

	public static void main(String[] args) {
		String s="alice-in-wonderland.txt";
		
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
		
		s="christmas-carol.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="huck-finn.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="les-mis.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="metamorphosis.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="my-man-jeeves.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="pride-prejudice.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="tale-of-two-cities.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());
		
		s="tom-sawyer.txt";
		q=new TopQuotes(s);
		qB=new TopQuotesB(s);
		cArr=q.topQuotes();
		cArrB=qB.topQuotes();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+q.gettCreate()+", "+qB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+q.gettAdd()+", "+qB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+q.gettGetTop()+", "+qB.gettGetTop());

	}

}
