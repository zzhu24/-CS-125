//UIUC CS125 FALL 2014 MP. File: Factorial.java, CS125 Project: Challenge1-DebugMe, Version: 2015-02-04T06:51:37-0600.757212307

/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author zzhu24
 */
public class Factorial {
	public static void main(String[] args) {
		int userinput;
		System.out.println("Enter a number between 1 and 20 inclusive.");
		userinput = TextIO.getlnInt();
		
		while (userinput < 1 || userinput >= 21) 
		{System.out.println("Enter a number between 1 and 20 inclusive.");
		userinput = TextIO.getlnInt();		}
		int count = 1;
		long answer = 1;
		
		while (count <= userinput)
		{answer = count * answer;
		count ++;}
		
		System.out.println( userinput + "! = " + answer);
		
	}
}
