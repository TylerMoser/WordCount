package me.tylermoser.wordcount;

/**
 * This helper class pairs a word to its number of occurrences. 
 * 
 * I would often use either Apache's or JavaFx's Pair class, but I felt coding
 * the getters/setters here provided a nicer interface.
 */
public class Pair {
	
	private int count;
	private String word;
	
	public Pair(int count, String word) {
		this.count = count;
		this.word = word;
	}
	
	public String toString() {
		return this.count + " " + this.word;
	}

	/**
	 * Different teams have different best practices regarding Javadoc. I have 
	 * worked on teams were all Javadoc rules were strongly followed, and teams
	 * where using Javadoc at all was frowned-upon. For the sake of this 
	 * assessment, I will be adding a moderate amount of Javadoc, but will not
	 * be documenting getters and setters. In many cases, I would use Lombok to
	 * generate getters and setters.
	 */
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
