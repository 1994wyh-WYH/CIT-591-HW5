package TextualAnalysisOfBooks;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
	private String fileName;
	private HashMap<String, Integer> m;
	
	/**
	 * This is the constructor of the class.
	 * This method builds a HashMap connecting words and their frequencies of appearance.
	 * @param fn, file name
	 */
	public WordFrequency(String fn) {
		fileName=fn;
		m=new HashMap<>();
		
		// Set up the HashMap.
		try {
			File inputFile=new File(fileName);
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				String s=in.nextLine();
				String[] sArr=s.split("\\t|,| |\"|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/");;
				for(String current:sArr) {
					// Skip empty strings caused by parsing.
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
						current=current.substring(0, current.length()-1);
					}
					// Check empty again.
					if(current.equals(""))
						continue;
					
					// Check and update frequency.
					if(m.containsKey(current)) {
						int v=m.get(current);
						v++;
						m.put(current, v);
					}
					else {
						m.put(current, 1);
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
		HashMap<String, Integer> mTemp=m;
		String[] cTen=new String[10];
		int count=0;
		int max=0;
		while(count<10) {
			String kk="";
			for(String k : mTemp.keySet()) {
				int v=m.get(k);
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
		return cTen;
	}

	/**
	 *  This is the getter of the hashmap. Just for testing.
	 * @return m.
	 */
	public HashMap<String, Integer> getM() {
		return m;
	}
}
