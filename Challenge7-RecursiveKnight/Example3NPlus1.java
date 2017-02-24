//UIUC CS125 FALL 2014 MP. File: Example3NPlus1.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-04-23T13:50:12-0500.789891105
public class Example3NPlus1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Using a loop:");
		loop3Nplus1(9);
		System.out.println("Using recursion we can print it backwards:");
		recurse(9);
	}

	private static void loop3Nplus1(int n) {
		System.out.print(n);
		do {
			n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
			System.out.print("," + n);
		} while (n != 1);
		System.out.println();
	}


	private static void recurse(int i) {
		if(i==1) { // Basecase - done!
			System.out.print(i);
			return;
		}
		int nextI = (i % 2 == 0) ? 
				 (i / 2) /*If i is even, divide by 2 */ 
				: (3 * i + 1); /* otherwise triple and add 1*/
		recurse(nextI);
		System.out.print("," + i);
	}

}
