# Word Frequency Coding Exercise

This application accepts a piece of text, and outputs each word that 
appears in the text alongside the number of times that word appears. 
The word counts are sorted from most to least frequently occurring. 

The application can be compiled using '.\mvnw clean install'

This also runs the JUnit test class, which includes several examples.

If you would like to run this application manually, the command line
interface supports passing both strings and files. There are several 
usage examples below.

ex: java -jar ./target/wordcount-0.0.1-SNAPSHOT.jar file "Some text string"
ex: java -jar ./target/wordcount-0.0.1-SNAPSHOT.jar file ./test.txt
