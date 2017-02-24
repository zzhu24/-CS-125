//UIUC CS125 FALL 2014 MP. File: SelectionSortTest.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-04-23T13:50:12-0500.789891105
import junit.framework.TestCase;

/**
 * You do not need to modify these tests
 * 
 * @author angrave
 */
public class SelectionSortTest extends TestCase {

	public void testSort() {
		double[] d = new double[] { 7, 3, 5, 2, 9, 1 };
		double[] expected = new double[] { 1, 2, 3, 5, 7, 9 };
		SelectionSort.sort(d);

		for (int i = 1; i < d.length; i++)
			assertEquals(expected[i], d[i]);
	}

	public void testSwap() {
		double[] d = new double[] { 1, 3, 2, 4 };
		SelectionSort.swap(d, 0, 3);
		assertTrue(d[0] == 4 && d[3] == 1);
	}

	public void testFindMin() {
		double[] d = new double[] { 7, 3, 5, 2, 9, 1 };
		assertEquals(3, SelectionSort.findMin(d, 3, 3));
		assertEquals(0, SelectionSort.findMin(d, 0, 0));
		assertEquals(3, SelectionSort.findMin(d, 0, 4));
		assertEquals(1, SelectionSort.findMin(d, 0, 2));
		assertEquals(5, SelectionSort.findMin(d, 3, 5));
	}

	public void testAuthorshipOfAllFiles() {
		String[] files = new String[] { "BinarySearch.java",
				"GridCounting.java", "MazeRunner.java", "MolecularSort.java",
				 "RecursiveKnight.java", "RobotLink.java",
				"SelectionSort.java" };
		String todo = "";
		for (int i = 0; i < files.length; i++) {
			String f = files[i].trim();

			boolean success = CheckInputOutput.checkAuthorship(f);
			if (!success)
				todo += " " + f;

		} // for
		if (todo.length() > 0)
			fail("Fix @authorship in" + todo);
	}
}
