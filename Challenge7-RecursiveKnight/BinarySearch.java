//UIUC CS125 FALL 2014 MP. File: BinarySearch.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2015-04-23T13:50:12-0500.789891105
/**
* 
* @author zzhu24
*
*/

public class BinarySearch {
	/** Wrapper method. Just runs the recursive search method below for the entire array*/
	public static boolean search(int[] array, int key) {
		return search(array, key, 0, array.length - 1);
	}

	/**
	 * Recursive search using Divide and Conquer approach:
	 * The given array is already sorted so we can very quickly discover if the key is in the array or not.
	 * Hint: For the recursive case check the value at (lo+hi)/2
	 * and proceed accordingly.
	 */
	static boolean search(int[] array, int key, int lo, int hi) {
	if(lo>hi)
	return false;
	int mid=(lo+hi)/2;
	if(array[mid]==key) return true;
	if(array[mid]<key)
	return search(array, key, mid+1, hi);
	return search(array,key, lo, mid-1);}}
