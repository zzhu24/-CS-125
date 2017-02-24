//UIUC CS125 FALL 2014 MP. File: CaesarCipher.java, CS125 Project: Challenge3-TopSecret, Version: 2015-02-16T08:49:40-0600.623536504
/**
 * A program to search for to encrypt and decrypt lines of text. See
 * CaesarCipher.txt
 * Hints: line.charAt( int ) is useful.
 * You'll need loops, and conditions and variables
 * You'll need to read the Test cases to understand how your program should work.
 * Good Programming Hints: "DRY: Don't Repeat Yourself"
 * Try to make your program as short as possible.
 * TODO: add your netid to the line below
 * @author zzhu24
 */
public class CaesarCipher {

	public static void main(String[] strings) {
		System.out.println("Please enter the shift value (between -25..-1 and 1..25)");
		int context = TextIO.getlnInt();
		boolean check = true;
		
		while(check){
		if((context < -25 && context != -999 ) || ( context > 25 && context != 999) || context == 0 ){
		System.out.println(context + " is not a valid shift value.");
		System.out.println("Please enter the shift value (between -25..-1 and 1..25)");
		context = TextIO.getlnInt();}
		else{
		check = false; 
		if(context != 999 && context != -999){
		System.out.println("Using shift value of " + context);}
		else if (context == 999 || context == -999){
		System.out.println("Using position shift");}}}
		
		TextIO.putln("Please enter the source text (empty line to quit)");
		String userInput = TextIO.getln();
		while(!userInput.equals("")){
		System.out.println("Source   :" + userInput);
		userInput = userInput.toUpperCase();
		TextIO.put("Processed:");
			
		if(context == -999){
		for(int a = 0; a < userInput.length(); a++){
		char character = userInput.charAt(a) ;
		if (character >= 'A' && character<= 'Z'){
		for(int b = 1; b <= a; b++){
		character =(char) (character - 1);
		if(character < 'A')
		character = 'Z';
		if(character > 'Z')
		character = 'A';}}
		TextIO.put(character);}
		System.out.println();
		System.out.println("Please enter the source text (empty line to quit)");
		userInput = TextIO.getln();
		continue;}
				
		if(context == 999){
		for(int c = 0; c < userInput.length(); c++){
		char character = userInput.charAt(c);
		if( character >= 'A' && character <= 'Z')
		{character = (char)( userInput.charAt(c) + c );
		while(character < 'A')
		character = (char)(character + 26 );
		while(character > 'Z')
		character = (char)(character - 26);}  
		TextIO.put(character);}
		System.out.println();
		System.out.println("Please enter the source text (empty line to quit)");
		userInput = TextIO.getln();
		continue;}
		
		for(int i = 0; i < userInput.length(); i++){
		char character = userInput.charAt(i);
		if( character >= 'A' && character <= 'Z')
		{if((char)(character + context) < 'A')
		character = (char) (character + context + 26);
		else if((char)(character + context) > 'Z')
		character = (char) (character + context - 26);
		else character = (char) (character + context);}
		if(userInput != "")
		TextIO.put(character);}
		
        System.out.println();
		System.out.println("Please enter the source text (empty line to quit)");
		userInput = TextIO.getln();}
		
		System.out.println("Bye.");}}



