package TextualAnalysisOfBooks;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
/**
 * A version.
 * This class gets the top 10 letters in the book.
 * @author Yihan
 *
 */
public class LetterFrequency {
	private String fileName;
	private HashMap<Character, Integer> frequency;
	private long tCreate;
	private long tAdd;
	private long tCheck;
	private int cCheck;
	private long tUpdate;
	private int cUpdate;
	private long tGetTop;
	
	/**
	 * This is the constructor of the class.
	 * This method builds a HashMap connecting characters and their frequencies of appearance.
	 * @param fn, file name
	 */
	public LetterFrequency(String fn) {
		tCreate=0;
		tAdd=0;
		tCheck=0;
		tUpdate=0;
		tGetTop=0;
		cCheck=0;
		cUpdate=0;
		
		
		fileName=fn;
		long sCreate = System.nanoTime();
		frequency=new HashMap<>();
		long eCreate = System.nanoTime();
		tCreate+=eCreate-sCreate;
		
		long sAdd=System.nanoTime();
		for(char c='a';c<='z';c++) {
			frequency.put(c, 0);
		}
		long eAdd=System.nanoTime();
		tAdd+=(eAdd-sAdd)/26;
		// Set up the HashMap.
		try {
			File inputFile=new File(fileName);
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				String s=in.nextLine();
				char[] cArr=s.toCharArray();
				for(char c:cArr) {
					long sCheck=System.nanoTime();
					if(frequency.containsKey(c)) {
						long eCheck=System.nanoTime();
						tCheck+=eCheck-sCheck;
						cCheck++;
						
						int v=frequency.get(c);
						v++;
						
						long sUpdate=System.nanoTime();
						frequency.put(c, v);
						long eUpdate=System.nanoTime();
						tUpdate+=eUpdate-sUpdate;
						cUpdate++;
					}
					else if(c>=65 && c<=90) {
						char cc=(char) (c+32);
						int v=frequency.get(cc);
						v++;
						
						long sUpdate=System.nanoTime();
						frequency.put(cc, v);
						long eUpdate=System.nanoTime();
						tUpdate+=eUpdate-sUpdate;
						cUpdate++;
					}
				}
			}
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * This methods returns the top ten appearing characters as an array.
	 * @return an array containing the top ten appearing characters.
	 */
	public char[] topFrequentLetter() {
		long sTop=System.nanoTime();
		HashMap<Character, Integer> mTemp=frequency;
		char[] cTen=new char[10];
		int count=0;
		int max=0;
		while(count<10) {
			char kk='a';
			for(char k : mTemp.keySet()) {
				int v=frequency.get(k);
				if(max<v) {
					max=v;
					kk=k;
					}
				}
			cTen[count]=kk;
			mTemp.remove(kk);
			count++;
			max=0;
		}
		long eTop=System.nanoTime();
		tGetTop+=eTop-sTop;
		return cTen;
	}

	
	/**
	 * This method gets the creating time of the structure.
	 * @return the creating time of the structure in nano sec.
	 */
	public long gettCreate() {
		return tCreate;
	}
	
	/**
	 * This method gets the adding time of the structure.
	 * @return the adding time of the structure in nano sec.
	 */
	public long gettAdd() {
		return tAdd;
	}
	
	/**
	 * This method gets the checking time of the structure.
	 * @return the checking time of the structure in nano sec.
	 */
	public long gettCheck() {
		return tCheck/cCheck;
	}
	
	/**
	 * This method gets the updating time of the structure.
	 * @return the updating time of the structure in nano sec.
	 */
	public long gettUpdate() {
		return tUpdate/cUpdate;
	}

	/**
	 * This method gets the time for getting tops of the structure.
	 * @return the time for getting tops of the structure in nano sec.
	 */
	public long gettGetTop() {
		return tGetTop;
	}
}
