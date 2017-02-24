//UIUC CS125 FALL 2014 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T11:14:11-0600.769961893
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author zzhu24
 */
public class FindScriptLine {

	public static void main(String[] args) {
		TextIO.putln("Please enter the word(s) to search for");
		String keyword = TextIO.getln();
		TextIO.putln("Searching for '" + keyword + "'" );
		String userInput = keyword;
		String lowerCase = keyword.toLowerCase();
		String upperCase = keyword.toUpperCase();
		int number = 0;
		TextIO.readFile("thematrix.txt");
		int length = keyword.length();

		while( false == TextIO.eof()){
		String line = TextIO.getln();
		number++;
		
		if(line.indexOf(lowerCase) >= 0 ){
		TextIO.putln(number + " - " + line.trim());}
		
		else if(line.indexOf(upperCase) >= 0){
		TextIO.putln(number + " - " + line.trim());}
		
		else if(line.indexOf(upperCase.substring(0,1) + lowerCase.substring(1, length)) >= 0)
		TextIO.putln(number + " - " + line.trim());}
		
		TextIO.putln("Done Searching for '" + userInput + "'");
		
		// TODO: Implement the functionality described in FindScriptLine.txt
        // TODO: Test your code manually and using the automated unit tests in FindScriptLineTest		
	}
}
