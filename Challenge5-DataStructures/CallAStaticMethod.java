//UIUC CS125 FALL 2014 MP. File: CallAStaticMethod.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/*@author zzhu24*/

/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 */
class CallAStaticMethod {

	public static void main(String[] args) {
    while (!TextIO.eof()) {
	String text = TextIO.getln();
	if(ExampleClassMethods.isEmailAddress(text)){
	int textLength = text.length();
	int padNumber;
	if(textLength < 40){
	padNumber = 40 - textLength;
	text = ExampleClassMethods.createPadding('.',padNumber) + text;}
	// Use ExampleClassMethods
	// 'isEmailAddress' and 'createPadding' to complete this method
	TextIO.putln(text);}}}}