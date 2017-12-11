package TextualAnalysisOfBooks;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * A version.
 * This class finds the top-10 shortest and longest quotations based on length.
 * @author Yihan
 *
 */
public class TopQuotes {
	private String fileName;
	private ArrayList<String> wholeBook; // Stores each line in the book.
	private long tCreate;
	private long tAdd;
	private int cAdd;
	private long tGetTop;
	/**
	 * This is the constructor of the class.
	 * @param s, the file name got passed in.
	 */
	public TopQuotes(String s) {
		tCreate=0;
		tAdd=0;
		cAdd=0;
		tGetTop=0;
		fileName=s;
		wholeBook=new ArrayList<>();
		try {
			File inputFile=new File(fileName);
			// Fake "end line" (bug occurs in "tom-swayer.txt") ! File reading fails at a point.
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				String nl = in.nextLine();
				wholeBook.add(nl);
				
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method finds the top ten quotes in term of length.
	 * @return String array of top quotes.
	 */
	public String[] topQuotes() {
		long sTop=System.nanoTime();
		HashMap<String, Integer> sTemp=getDoubleQuotes();
		sTemp.putAll(getSingleQuotes());
		// Take care of cases where quotation number is less than 10.
		int l;
		if(sTemp.size()>=10) {
			l=10;
		}
		else {
			l=sTemp.size();
		}
		String[] cTop=new String[l];
		int count=0;
		String t="";
		
		while(count<l) {
			for(String s : sTemp.keySet()) {
				if(t.length()<sTemp.get(s)) {
					t=s;
					}
				}
			cTop[count]=t;
			sTemp.remove(t);
			count++;
			t="";
		}
		long eTop=System.nanoTime();
		tGetTop+=eTop-sTop;
		return cTop;
	}
	
	/**
	 * This method gets all the double quotations in the book.
	 * @return an arraylist of double quotations.
	 */
	public HashMap<String, Integer> getDoubleQuotes(){
		long sCreate=System.nanoTime();
		HashMap<String, Integer> ret=new HashMap<>();	
		long eCreate=System.nanoTime();
		tCreate=(eCreate-sCreate);
		
		StringBuilder line=new StringBuilder("");
			
		for(String eachLine:wholeBook) {
				line.append(eachLine);
				line.append(" ");
				// Find the number of double quotes in a line.
				int count=findPattern(line.toString(),"\"").size();
				// If no double quotes, ignore it.
				if (count==0){
					line.delete(0, line.length());
				} 
				// If number is odd, there may be one quotation splited in two lines. 
				// Need to concatenate with next line.
				else if(count % 2 == 1){
					continue;
				} 
				else {
					// Find all match substrings in a line and add to the return arraylsit.
					ArrayList<String> res = findPattern(line.toString(), "\".*\"");
					for (String s: res){
						long sAdd=System.nanoTime();
						ret.put(s, s.length());
						long eAdd=System.nanoTime();
						tAdd+=(eAdd-sAdd);
						cAdd++;
					}
					line.delete(0, line.length());
				}
			}
			
		return ret;
	}
	
	/**
	 * This method gets all the single quotations of the book.
	 * @return an arraylist of single quotations.
	 */
	public HashMap<String, Integer> getSingleQuotes(){
		long sCreate=System.nanoTime();
		HashMap<String, Integer> ret=new HashMap<>();
		long eCreate=System.nanoTime();
		tCreate=(eCreate-sCreate);
		StringBuilder line=new StringBuilder("");
			
		for(String eachLine:wholeBook) {
				line.append(eachLine);
				line.append(" ");
				// Find the number of single quotes excluding single quotes in a word, e.g., someone's.
				int count=findPattern(line.toString(),"\'").size()-findPattern(line.toString(),"[^\\s(),]'[^\\s(),]").size();
				
				if (count==0){
					line.delete(0, line.length());
				} 
				else if(count % 2 == 1){
					continue;
				} 
				else {
					String[] sArr=line.toString().split("[\\s+]'");
					for(String temp:sArr) {
						// Add ' at the front since split eliminates it.
						temp="\'"+temp;
						ArrayList<String> res = findPattern(temp, "[^A-Za-z]'.*'[^A-Za-z]");
						for (String s: res){
							long sAdd=System.nanoTime();
							ret.put(s, s.length());
							long eAdd=System.nanoTime();
							tAdd+=(eAdd-sAdd);
							cAdd++;
						}
					}
					line.delete(0, line.length());
				}
			}
			
		return ret;
	}
	
	/**
	 * This methods finds all corresponding patterns in a given string.
	 * @param s, the given string to search.
	 * @param p, the pattern to match.
	 * @return an arraylist of all match substrings in the string.
	 */
	public ArrayList<String> findPattern(String s, String p){
		ArrayList<String> ret = new ArrayList<>();
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()){
			ret.add(matcher.group(0));
		}
		return ret;
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
