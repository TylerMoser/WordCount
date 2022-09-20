package me.tylermoser.wordcount;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests different word counting scenarios
 */
public class WordCounterTest {
	
	/**
	 * Prints a blank line in between each test
	 */
	@Before
	public void setup() {
		System.out.println();
	}

	/**
	 * A trivial test
	 */
    @Test
    public void test1() {
    	WordCounter.printWordCounts("the cat is in the bag");
    }
    
    /**
     * This test uses a longer string and adds in punctuation
     */
    @Test
    public void test2() {
    	WordCounter.printWordCounts("This is a slightly more complicated test string, but I know my code can handle it.");
    }
    
    /**
     * This test includes more duplicate words
     */
    @Test
    public void test3() {
    	WordCounter.printWordCounts("I want to test my code, so I wrote this test to test my code.");
    }
    
    /**
     * This test adds in multiple sentences with significant repetition.
     */
    @Test
    public void test4() {
    	WordCounter.printWordCounts("This test has multiple sentences. This is the second sentence. This is the third sentence.");
    }
    
    /**
     * This test adds in contractions
     */
    @Test
    public void test5() {
    	WordCounter.printWordCounts("This code can even handle contractions like: isn't, hasn't, wasn't, you'll, it's, and we're.");
    }
    
    /**
     * This test adds additional blank spacing, and tests the edge case where there is only 1 word
     */
    @Test
    public void test6() {
    	WordCounter.printWordCounts("   word word word  word word word  word word word      word   ");
    }
    
    /**
     * This test evaluates the edge case where the string is blank
     */
    @Test
    public void test7() {
    	WordCounter.printWordCounts("");
    }
}
