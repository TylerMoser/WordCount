package me.tylermoser.wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The entrypoint for the word-counting logic
 * 
 * Allows 2 ways of counting words, either a string can be provided, or a file.
 * 
 * ex: java -jar .\target\wordcount-0.0.1-SNAPSHOT.jar file "Some text string"
 * ex: java -jar .\target\wordcount-0.0.1-SNAPSHOT.jar file .\test.txt
 */
public class WordCountApplication {
    public static void main(String[] args) {
    	final String inputString;
        if (args[0].equalsIgnoreCase("file")) {
        	try {
				inputString = Files.readString(Paths.get(args[1]));
			} catch (IOException e) {
				System.out.println(args[1] + " is not a valid file path.");
				return;
			}
        } else if (args[0].equalsIgnoreCase("string")) {
        	inputString = args[1];
        } else {
        	System.out.println("The first command line argument must be either 'string' or 'file'");
        	return;
        }
        
        WordCounter.printWordCounts(inputString);
    }
}
