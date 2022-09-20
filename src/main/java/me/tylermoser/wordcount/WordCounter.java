package me.tylermoser.wordcount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The main application logic. Counts the number of words in a String.
 */
public class WordCounter {
	
	/**
	 * Prints each word and the number of times it appears in the input String,
	 * sorted from most to least frequent.
	 * 
	 * Generally I would avoid using System.out over a logger, and I certainly
	 * wouldn't have application logic print directly to standard-out. However,
	 * for this assessment, I will do so for simplicity's sake.
	 */
	public static void printWordCounts(String inputString) {
		final List<Pair> wordCounts = WordCounter.count(inputString);
		for (Pair wordCount : wordCounts) {
			System.out.println(wordCount);
		}
	}
	
	/**
	 * Counts the occurrences of each word in the input String, and sorts from
	 * most to least frequent. 
	 * 
	 * This method defines a word as an alpha-numeric string of characters, where
	 * the apostrophe is the only allowed punctuation-mark. 
	 */
	private static List<Pair> count(String inputString) {
		// Parse the String
		final Matcher tokenizer = Pattern.compile("[A-Za-z0-9']+").matcher(inputString);
		
		// Count the number of occurrences for each word
		final Map<String, Integer> counts = new HashMap<>();
		while (tokenizer.find()) {
			final String word = tokenizer.group().toLowerCase();
			int currentCount = counts.getOrDefault(word, 0);
			counts.put(word, ++currentCount);
		}
		
		// Sort the occurrences
		return counts.entrySet().stream()
		        .map(e -> new Pair(e.getValue(), e.getKey()))
		        .sorted((p1, p2) -> p2.getCount() - p1.getCount())
		        .collect(Collectors.toList());
	}
}
