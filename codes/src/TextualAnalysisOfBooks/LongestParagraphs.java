package TextualAnalysisOfBooks;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 * A version
 * This class finds top-10 longest paragraphs in a book.
 * @author Yihan
 *
 */
public class LongestParagraphs {

	private HashMap<String, Integer> paragraphs;
	private long tCreate;
	private long tAdd;
	private int cAdd;
	private long tGetTop;
	
	/**
	 * This is the constructor of the class.
	 * @param s, String of book file name.
	 */
	public LongestParagraphs(String s) {
		tCreate=0;
		tAdd=0;
		cAdd=0;
		tGetTop=0;
		
		long sCreate=System.nanoTime();
		paragraphs=new HashMap<>(); 
		long eCreate=System.nanoTime();
		tCreate=eCreate-sCreate;
		
		boolean flag=true; // indicates whether the previous line is a valid line.
		try {
			File inputFile=new File(s);
			Scanner in = new Scanner(inputFile);	
			StringBuilder eachP=new StringBuilder("");
			while(in.hasNextLine()) {
				String line=in.nextLine();
				// Copy the lines consisting paragraphs while exclude empty lines.
				if(!line.isEmpty()) {
					eachP.append(line);
					flag=true;
				}
				else {
					if(flag) {
						long sAdd=System.nanoTime();
						paragraphs.put(eachP.toString(), eachP.length());
						long eAdd=System.nanoTime();
						tAdd+=(eAdd-sAdd);
						cAdd++;
						
						eachP.delete(0, eachP.length());
						flag=false;
					}
				}
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method finds the top 10 longest paragraph in a book.
	 * @return a string of longest paragraph.
	 */
	public String[] getLongestParagraphs() {
		long sTop=System.nanoTime();
		HashMap<String, Integer> mTemp=paragraphs;
		String[] cTen=new String[10];
		int count=0;
		int max=0;
		while(count<10) {
			String kk="";
			for(String k : mTemp.keySet()) {
				int v=paragraphs.get(k);
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
		return tCreate/2;
	}
	
	/**
	 * This method gets the adding time of the structure.
	 * @return the adding time of the structure in nano sec.
	 */
	public long gettAdd() {
		return tAdd/cAdd;
	}
	
	
	/**
	 * This method gets the time for getting tops of the structure.
	 * @return the time for getting tops of the structure in nano sec.
	 */
	public long gettGetTop() {
		return tGetTop;
	}
}
