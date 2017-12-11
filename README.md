# Textual Analysis

The text analyses are performed using 5 classes. The classes’ main functional methods all use HashMap for storing information for further analysis.

LetterFrequency class gets the top 10 letters in the book.
WordFrequency class gets the most frequent words in the book.
WordFrequencyStopList class gets the most frequent words in the book that are not in the stop list.
TopQuotes class finds the top-10 shortest and longest quotations based on length.
LongestParagraphs class finds the top-10 shortest and longest quotations based on length.

A main class (the TexualAnalysis class) was built to print out all the analysis results of the methods. All 9 given books are used to test the methods.

***Notice that because “tom-sawyer.txt” contains non-UTF_8 signs, the reading of file can be not explicit (terminates unexpectedly due to system preferences), therefore causing error in textual analysis.

***Also, minor bugs in getting top-10 quotes may appear when the texts are not properly written (for instance, the quotes don’t match, which happens a lot in “alice-in-wonderland.txt”), or due to limitations in Pattern/Matcher/String built-in functions.

In addition, 5 classes are built for printing out time consumption comparison between methods using ArrayList and HashMap.
