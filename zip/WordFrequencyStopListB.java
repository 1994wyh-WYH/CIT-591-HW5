package TextualAnalysisOfBooks;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * B version 
 * This class gets the most frequent words in a txt file that are not in the stop list.
 * @author Yihan
 *
 */
public class WordFrequencyStopListB {
	private ArrayList<String> stopList;
	private String fileName;
	private String stopFileName;
	private ArrayList<Integer> frequency;
	private ArrayList<String> words;
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
	 * @param fn, file name.
	 * @param sfn, stop-list file name.
	 */
	public WordFrequencyStopListB(String fn, String sfn) {
		tCreate=0;
		tAdd=0;
		cAdd=0;
		tCheck=0;
		tUpdate=0;
		tGetTop=0;
		cCheck=0;
		
		fileName=fn;
		stopFileName=sfn;
		
		long sCreate=System.nanoTime();
		frequency=new ArrayList<>();
		words=new ArrayList<>();
		long eCreate=System.nanoTime();
		tCreate=(eCreate-sCreate)/2;
		
		stopList=new ArrayList<>();
		// set up the stop list ArrayList.
		try {
			File inputFile=new File(stopFileName);
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				stopList.add(in.nextLine());
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// Set up the Arraylists.
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
					current=WordFrequency.convert(current);
					// Check empty again.
					if(current.equals(""))
						continue;
					
					
					//check if word exists in stop list.
					//if so, ignore it.
					if(stopList.contains(current)) {
						continue;
					}
					// Check and update frequency.
					long sCheck=System.nanoTime();
					if(words.contains(current)) {
						long eCheck=System.nanoTime();
						tCheck+=eCheck-sCheck;
						cCheck++;
						
						int i=words.indexOf(current);
						int v=frequency.get(i);
						v++;
						
						long sUpdate=System.nanoTime();
						frequency.set(i, v);
						long eUpdate=System.nanoTime();
						tUpdate+=eUpdate-sUpdate;
						cUpdate++;
					}
					else {
						long sAdd=System.nanoTime();
						words.add(current);
						frequency.add(1);
						long eAdd=System.nanoTime();
						tAdd+=(eAdd-sAdd)/2;
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
		ArrayList<Integer> aTemp=frequency;
		String[] cTen=new String[10];
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
			cTen[count]=words.get(i);
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

