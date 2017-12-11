package TextualAnalysisOfBooks;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class LetterFrequencyTest {
	private String s;
	
	/*
	 * Before makes the test case run before every other test case.
	 */
	@Before
	public void setupFile() {
		s="alice-in-wonderland.txt";
	}
	
	@Test
	public void testHashMap() {
		LetterFrequency lf=new LetterFrequency(s);
		HashMap <Character, Integer> m=lf.getM();
		assertEquals("HashMap's length should be 26.", 26, m.size());
	}
	
	
	@Test
	// Tests should always should be void and public.
	public void testTopTenLen() {
		// 1. Setup things as needed.
		LetterFrequency lf=new LetterFrequency(s);// Initialize the class object;
		//Run part of the methods and test whether the output is as expected.
		
//		// 2. have an assertion to compare expected value to the actual value.
//		assertEquals("The value should always be 10!", 10,aValue());
		
//		// Notice that assertEquals tests the addresses of the two objects! if pass objects
//		assertNotNull("The object can not be null!", lf.topFrequentLetter());
		char[] cArr=lf.topFrequentLetter();
		int len=0;
		for(char c:cArr) {
			if(c!='\0') {
				len++;
			}
		}
		assertEquals("The valid char number should equal the array length!", len, cArr.length);
		
	}
	
	
//	// If expect exception during test (if throw exception then pass)
//	@Test(expected=IllegalArgumentException.class)
//	public void test(){
//		
//	}
	

}
