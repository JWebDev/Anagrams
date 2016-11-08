package com.jdev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Anagrams.
 * 
 * @author Oleg Fedak
 *
 */

public class AnagramsWithoutTimers {

	// use LinkedHashMap because they have O(1) for contains(). LinkedHashMap if we want to print anagrams in the iteration order(In the file reading order).
	// TreeSet for store founded anagrams alphabetical order.
	private Map<String, TreeSet<String>> anagrams = new LinkedHashMap<String, TreeSet<String>>();

	public AnagramsWithoutTimers(String fileName) throws IOException, URISyntaxException {

		String filePath = getClass().getResource("../../testData/" + fileName).getPath();

		readFileAndFindAnagrams(filePath);
		printAnagrams();
	}

	private void readFileAndFindAnagrams(String filePath) throws IOException {

		// use BufferedReader because is it faster (for example) than @Scanner. Has larger buffer memory and does not make any conversions, just reads a line from the stream.
		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		// Another short solution, with the same productivity. Stream<String> lines = Files.lines(Paths.get(filePath)); lines.forEach((i) -> sortAndPutInAnagramsMap(i));

		String line = null;
		while ((line = reader.readLine()) != null) {
			char[] c = line.toLowerCase().toCharArray();
			Arrays.sort(c);
			String sortedString = new String(c);

			if (!anagrams.containsKey(sortedString)) {
				anagrams.put(sortedString, new TreeSet<String>(Arrays.asList(line)));
			} else {
				anagrams.get(sortedString).add(line);
			}
		}
		// Do not check to zero, if the reader is zero, then the program will stop before this line. Normally, the streams closes in the finally block.
		reader.close();
	}

	private void printAnagrams() {
		anagrams.forEach((key, value) -> {
			if (value.size() > 1) {
				value.forEach(item -> System.out.print(item + " "));
				System.out.println();
			}
		});
	}

	public static void main(String[] args) {

		String fileName = args.length == 0 ? "sample.txt" : args[0];

		// As you said, I focus on the program itself, so I do only one "try catch" block.
		try {
			new AnagramsWithoutTimers(fileName);
		} catch (IOException | URISyntaxException e) {
			System.out.println("File not found! or there was some error during file reading.");
			e.printStackTrace();
		}
	}
}
