## Anagrams

List all anagrams of words contained within a file
Two words are defined as anagrams if they do share the same letters, but are in a different order (i.e.
the english words race and care are anagrams).
Given an input file which contains one word per line, as an output construct a list of all anagrams 
from that input file. Print those words to the console, where all words that are an anagram should 
each other should be on the same line.
As an example, given the input file:

*act  
cat  
tree  
race  
care  
acre  
bee*

the output should be:

*act cat  
acre care race*

## Tests
 - Three cold launches from my work machine.
 
--------- TEST 1: 350000_unique_words.txt ---------

Run 1:  

	36441 - Founded anagram packs.  
	0.252 s - Read words from the file and found anagrams time.  
	0.828 s - Print lines time.  
	1.08 s - Total time execution time.
	
Run 2:  

	36441 - Founded anagram packs.  
	0.358 s - Read words from the file and found anagrams time.  
	0.992 s - Print lines time.  
	1.351 s - Total time execution time.  
	
Run 3:  

	36441 - Founded anagram packs.  
	0.312 s - Read words from the file and found anagrams time.  
	0.978 s - Print lines time.  
	1.29 s - Total time execution time.  
	
------------------------------------------------------------
	
--------- TEST 2: 1million_with_duplicates.txt ---------

Run 1:  

	61697 - Founded anagram packs.  
	1.075 s - Read words from the file and found anagrams time.  
	0.623 s - Print lines time.  
	1.698 s - Total time execution time.  
	
Run 2:  

	61697 - Founded anagram packs.  
	1.057 s - Read words from the file and found anagrams time.  
	0.593 s - Print lines time.  
	1.651 s - Total time execution time.  
	
Run 3:  

	61697 - Founded anagram packs.  
	1.095 s - Read words from the file and found anagrams time.  
	0.634 s - Print lines time.  
	1.729 s - Total time execution time.  
	
------------------------------------------------------------
	
--------- TEST 3: 10millions_with_duplicates.txt ---------

Run 1:  

	61697 - Founded anagram packs.  
	5.201 s - Read words from the file and found anagrams time.  
	0.53 s - Print lines time.  
	5.731 s - Total time execution time.  
	
Run 2:

	61697 - Founded anagram packs.  
	5.374 s - Read words from the file and found anagrams time.  
	0.658 s - Print lines time.  
	6.048 s - Total time execution time.  
	
Run 3:  

	61697 - Founded anagram packs.  
	5.155 s - Read words from the file and found anagrams time.  
	0.518 s - Print lines time.  
	5.673 s - Total time execution time.  
	
------------------------------------------------------------
