package TextualAnalysisOfBooks;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
/**
 * A version
 * This class gets the most frequent words in a txt file.
 * @author Yihan
 *
 */
public class WordFrequency {
	private String fileName;
	private HashMap<String, Integer> frequency;
	private long tCreate;
	private long tAdd;
	private int cAdd;
	private long tCheck;
	private int cCheck;
	private long tUpdate;
	private int cUpdate;
	private long tGetTop;
	
	/**
	 * This is the constructor of the class.
	 * This method builds a HashMap connecting words and their frequencies of appearance.
	 * @param fn, file name
	 */
	public WordFrequency(String fn) {
		tCreate=0;
		tAdd=0;
		cAdd=0;
		tCheck=0;
		tUpdate=0;
		tGetTop=0;
		cCheck=0;
		cUpdate=0;
		
		fileName=fn;
		
		long sCreate=System.nanoTime();
		frequency=new HashMap<>();
		long eCreate=System.nanoTime();
		tCreate=(eCreate-sCreate);
		
		// Set up the HashMap.
		try {
			File inputFile=new File(fileName);
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				String s=in.nextLine();
				String[] sArr=s.split("\\t|,| |\"|;|\\.|\\?|!|-|--|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/");;
				for(String current:sArr) {
					//Skip empty strings caused by parsing.
					if(current.length()==0) {
						continue;
					}
					
					else {
					
					//Check ' at front.
					if(current.charAt(0)=='\'') {
						current=current.substring(1, current.length());
					}
					// Check empty again.
					if(current.equals(""))
						continue;
					
					// Check ' at end.
					if(current.charAt(current.length()-1)=='\'') {
						if(current.length()<=2)
							continue;
						current=current.substring(0, current.length()-1);
					}
					// Check empty again.
					if(current.equals(""))
						continue;
					
					// Convert capitalized letter to lower-case.
					current=convert(current);
					// Check empty again.
					if(current.equals(""))
						continue;
					
					// Check and update frequency.
					long sCheck=System.nanoTime();
					if(frequency.containsKey(current)) {
						long eCheck=System.nanoTime();
						tCheck+=eCheck-sCheck;
						cCheck++;
						
						int v=frequency.get(current);
						v++;
						long sUpdate=System.nanoTime();
						frequency.put(current, v);
						long eUpdate=System.nanoTime();
						tUpdate+=eUpdate-sUpdate;
						cUpdate++;
					}
					else {
						long sAdd=System.nanoTime();
						frequency.put(current, 1);
						long eAdd=System.nanoTime();
						tAdd+=(eAdd-sAdd);
						cAdd++;
					}
					
					}
				}
			}
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * This methods returns the top ten appearing strings as an array.
	 * @return an array containing the top ten appearing strings.
	 */
	public String[] topFrequentWord() {
		long sTop=System.nanoTime();
		HashMap<String, Integer> mTemp=frequency;
		String[] cTen=new String[10];
		int count=0;
		int max=0;
		while(count<10) {
			String kk="";
			for(String k : mTemp.keySet()) {
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
	 * This method checks whether there exist upper-case letters in the word and convert them to lower-cases.
	 * @param s, string to check and update.
	 * @return an updated string with all lower case letters.
	 */
	public static String convert(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		String ret=sb.toString();
		return ret;
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
		return tAdd/cAdd;
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
