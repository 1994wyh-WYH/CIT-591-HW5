package TextualAnalysisOfBooks;

/**
 * This class is the overall test of textual analysis methods.
 * @author Yihan
 *
 */
public class TextualAnalysis {

	public static void main(String[] args) {
		String s="metamorphosis.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		LetterFrequency lf=new LetterFrequency(s);
		char[] cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words in terms of frequency.
		WordFrequency wf=new WordFrequency(s);
		String[] sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		String sl="stop-list.txt";
		WordFrequencyStopList wfs=new WordFrequencyStopList(s,sl);
		String[] sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 quotes in terms of length.
		TopQuotes tq=new TopQuotes(s);
		String[] sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 paragraphs in terms of length.
		LongestParagraphs np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);
			
		}
		
		s="alice-in-wonderland.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);
			
		}
		
		s="christmas-carol.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);
			
		}
		
		s="huck-finn.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");
		
		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);
			
		}
		
		s="les-mis.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);

		}
		
		s="my-man-jeeves.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);

		}
		
		s="pride-prejudice.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);

		}
		
		s="tale-of-two-cities.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);

		}
		
		s="tom-sawyer.txt";
		System.out.println("Txt sample: "+s);
		// Prints out the top 10 letters in terms of frequency.
		lf=new LetterFrequency(s);
		cArr=lf.topFrequentLetter();
		System.out.println("The top 10 frequent letters are:");
		for(char c:cArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words in terms of frequency.
		wf=new WordFrequency(s);
		sArr=wf.topFrequentWord();
		System.out.println("The top 10 frequent words are:");
		for(String c:sArr) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 words (excluding stop list) in terms of frequency.
		wfs=new WordFrequencyStopList(s,sl);
		sArr2=wfs.topFrequentWord();
		System.out.println("The top 10 frequent words that are not in stop list are:");
		for(String c:sArr2) {
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 quotes in terms of length.
		tq=new TopQuotes(s);
		sArr3=tq.topQuotes();
		System.out.println("The top 10 quotations are:");
		for(String c:sArr3) {
			System.out.println();
			System.out.println(c);
		}
		System.out.println("**********************************");

		// Prints out the top 10 paragraphs in terms of length.
		np=new LongestParagraphs(s);
		System.out.println("The top 10 longest paragraphs in the selected book are:");
		for(String c:np.getLongestParagraphs()) {
			System.out.println();
			System.out.println(c);

		}
	}

}
