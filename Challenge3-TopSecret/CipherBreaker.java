//UIUC CS125 FALL 2014 MP. File: CipherBreaker.java, CS125 Project: Challenge3-TopSecret, Version: 2015-02-16T08:49:40-0600.623536504
/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the line below
 * 
 * @author zzhu24
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		TextIO.putln(line);
		line = line.toUpperCase();
        
		int spaceNumber = 0,
		punctuationNumber = 0,
		letterNumber = 0,
		mathNumber = 0;
		
		char letter;
		for(letter = 'A';letter <= 'Z'; )
		{for (int a = 0 ; a< line.length() ; a++)
		{if (line.charAt(a) ==letter)
		{letterNumber++;}}
		if (letterNumber != 0)
		{System.out.println(letter + ":" + letterNumber);}
		letter++;
		letterNumber = 0;}
		
		for (int a = 0 ; a< line.length() ; a++){
		if (line.charAt(a) == '1' || line.charAt(a) == '2' || line.charAt(a) == '3' || line.charAt(a) == '4' || line.charAt(a) == '5' || line.charAt(a) == '6' || line.charAt(a) == '7' || line.charAt(a) == '8' || line.charAt(a) == '9' || line.charAt(a) == '0')
		{mathNumber++;}}
		if (mathNumber != 0)
		{System.out.println("DIGITS:" + mathNumber);}
		
        for (int a = 0 ; a< line.length() ; a++){
		if (line.charAt(a) ==' ')
		{spaceNumber++;}}
		if (spaceNumber != 0)
		{System.out.println("SPACES:" + spaceNumber);}
		
		for (int a = 0 ; a< line.length() ; a++){
		if (line.charAt(a) ==  '\"' || line.charAt(a) == '\'' || line.charAt(a) == '-' || line.charAt(a) == '.' || line.charAt(a) == '!' || line.charAt(a) == ',')
		{punctuationNumber ++;}}
		if (punctuationNumber != 0)
		{System.out.println("PUNCTUATION:" + punctuationNumber);}
        }}
