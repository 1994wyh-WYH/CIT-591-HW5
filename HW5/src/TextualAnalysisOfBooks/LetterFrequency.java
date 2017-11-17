package TextualAnalysisOfBooks;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class LetterFrequency {
	private String fileName;
	private HashMap<Character, Integer> m;
	
	/**
	 * This is the constructor of the class.
	 * This method builds a HashMap connecting characters and their frequencies of appearance.
	 * @param fn, file name
	 */
	public LetterFrequency(String fn) {
		fileName=fn;
		m=new HashMap<>();
		for(char c='a';c<='z';c++) {
			m.put(c, 0);
		}
		// Set up the HashMap.
		try {
			File inputFile=new File(fileName);
			Scanner in = new Scanner(inputFile);	
			while(in.hasNextLine()) {
				String s=in.nextLine();
				char[] cArr=s.toCharArray();
				for(char c:cArr) {
					if(m.containsKey(c)) {
						int v=m.get(c);
						v++;
						m.put(c, v);
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
		HashMap<Character, Integer> mTemp=m;
		char[] cTen=new char[10];
		int count=0;
		int max=0;
		while(count<10) {
			char kk='a';
			for(char k : mTemp.keySet()) {
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
	public HashMap<Character, Integer> getM() {
		return m;
	}
	

}
