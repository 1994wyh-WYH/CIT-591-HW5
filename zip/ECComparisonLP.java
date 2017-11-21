package TextualAnalysisOfBooks;

public class ECComparisonLP {

	public static void main(String[] args) {
		String s="alice-in-wonderland.txt";
		
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
		
		s="christmas-carol.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="huck-finn.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="les-mis.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="metamorphosis.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="my-man-jeeves.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="pride-prejudice.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="tale-of-two-cities.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());
		
		s="tom-sawyer.txt";
		p=new LongestParagraphs(s);
		pB=new LongestParagraphsB(s);
		cArr=p.getLongestParagraphs();
		cArrB=pB.getLongestParagraphs();
		System.out.println("Txt sample: "+s);
		System.out.println("The time for creating a new object for version A and B respectively are: "
				+p.gettCreate()+", "+pB.gettCreate());
		System.out.println("The time for adding a new object for version A and B respectively are: "
				+p.gettAdd()+", "+pB.gettAdd());
		System.out.println("The time for getting tops for version A and B respectively are: "
				+p.gettGetTop()+", "+pB.gettGetTop());

	}

}
