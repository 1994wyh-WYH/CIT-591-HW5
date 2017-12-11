package TextualAnalysisOfBooks;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * B version
 * This class gets top 10 letters.
 * @author Yihan
 *
 */
public class LetterFrequencyB {
	private String fileName;
	private ArrayList<Integer> frequency;
	private ArrayList<Character> chars;
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
	public LetterFrequencyB (String fn) {
		tCreate=0;
		tAdd=0;
		tCheck=0;
		tUpdate=0;
		tGetTop=0;
		cCheck=0;
		cUpdate=0;
		
		fileName=fn;
		long sCreate = System.nanoTime();
		frequency=new ArrayList<>();
		chars=new ArrayList<>();
		long eCreate = System.nanoTime();
		tCreate+=(eCreate-sCreate)/2;
		
		// Initialize the arraylist containing the numbers of appearance of all letters.
		long sAdd=System.nanoTime();
		for(int i=0;i<26;i++) {
			frequency.add(0);
			chars.add((char)(i+97));
			
		}
		long eAdd=System.nanoTime();
		tAdd+=(eAdd-sAdd)/52;
		
		try {
			File inputFile=new File(fileName);
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				String s=in.nextLine();
				char[] cArr=s.toCharArray();
				for(char c:cArr) {
					long sCheck=System.nanoTime();
					if(chars.contains(c)) {
						long eCheck=System.nanoTime();
						tCheck+=eCheck-sCheck;
						cCheck++;
						
						int v=frequency.get(c-97);
						v++;
						
						long sUpdate=System.nanoTime();
						frequency.set(c-97, v);
						long eUpdate=System.nanoTime();
						tUpdate+=eUpdate-sUpdate;
						cUpdate++;
					}
					else if(c>=65 && c<=90) {
						char cc=(char) (c+32);
						int v=frequency.get(cc-97);
						v++;
						long sUpdate=System.nanoTime();
						frequency.set(cc-97, v);
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
		ArrayList<Integer> aTemp=frequency;
		char[] cTen=new char[10];
		int count=0;
		int max=0;
		int i=0;
		while(count<10) {
			int index=-1;
			for(int t : aTemp) {
				index++;
				if(max<t) {
					max=t;
					i=index;
					}
				}
			cTen[count]=chars.get(i);
			aTemp.remove(i);
			count++;
			max=0;
			i=0;
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

