//UIUC CS125 FALL 2014 MP. File: Winner.java, CS125 Project: Challenge1-DebugMe, Version: 2015-02-04T06:51:37-0600.757212307

/**
 * This program prints "a","b","c" depending on who has the highest score. The
 * given code may not be correct. Fix it and additional code to pass the unit
 * tests.
 * 
 * @see Winner-ReadMe.txt for details on how to complete this program.
 * @author zzhu24
 * 
 */
public class Winner {
	public static void main(String[] args) {
		System.out.println("Enter three unique integer scores.");

		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		int c = TextIO.getlnInt();
		
	if(a==b && b==c && a==c)
		{System.out.println("Enter three unique integer scores.");
	
	   int a1 = TextIO.getlnInt();
	   int b1 = TextIO.getlnInt();
	   int c1 = TextIO.getlnInt();

	   a = a1; b = b1; c = c1;}
	   
	if(a > b)
	    if(a > c)
	   {TextIO.put("1st Place:a");
}
	
	if(b > a)
		if(b > c)
	   { TextIO.put("1st Place:b");
}
	
	if(c > a)
		if(c > b)
	   { TextIO.put("1st Place:c" );
}
	}
}
