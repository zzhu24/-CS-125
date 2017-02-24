//UIUC CS125 FALL 2014 MP. File: Example2DArrays.java, CS125 Project: Challenge4-Photoscoop, Version: 2015-02-22T23:50:31-0600.728483840
public class Example2DArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] original = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		
		int[][] copy = new int[original.length * 2][original[0].length];
		
		for (int i = 0; i < copy.length; i++)
			for (int j = 0; j < copy[i].length; j++)
				copy[i][j] = original[i / 2][j];

		for (int i = 0; i < copy.length; i++)
			for (int j = 0; j < copy[i].length; j++) {
				TextIO.put(copy[i][j]);
				if (j != copy[i].length - 1)
					TextIO.put(",");
				else
					TextIO.putln();
			}
	}

}
