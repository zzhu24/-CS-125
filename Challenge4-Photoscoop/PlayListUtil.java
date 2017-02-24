//UIUC CS125 FALL 2014 MP. File: PlayListUtil.java, CS125 Project: Challenge4-Photoscoop, Version: 2015-02-22T23:50:31-0600.728483840
/**
 * zzhu24
 * @author angrave
 *
 */
public class PlayListUtil {

	/**
	 * Debug ME! Use the unit tests to reverse engineer how this method should work.
	 * Hint: Fix the formatting (shift-cmd-F) to help debug the following code
	 * @param list
	 * @param maximum
	 */
	public static void list(String[] list, int maximum) {
		if(maximum == -1){
		for (int i = 0; i< list.length; i++){
		if (i == 0)
		{TextIO.putln((i+1) + "." + " " + list[i]);}
		if (i != 0)
	    {TextIO.putln((i+1) + "." + " " + list[i] );}}}
		if (maximum != -1){
		for(int i = 0; i < maximum; i++){
		if (i == 0)
		{TextIO.put((i+1) + "." + " " + list[i] + "\n");}
		if (i != 0)
		{TextIO.put((i+1) + "." + " " + list[i]);}}}}

	/**
	 * Appends or prepends the title
	 * @param list
	 * @param title
	 * @param prepend if true, prepend the title otherwise append the title
	 * @return a new list with the title prepended or appended to the original list
	 */
	public static String[] add(String[] list, String title, boolean prepend) {
		String[] copyList = new String[list.length + 1];
		if (prepend)
		{copyList[0] = title;
		for( int i = 1; i < copyList.length; i++)
		{copyList[i] = list[i-1];}}
		if(!prepend){
		for(int i = 0; i < list.length; i++)
		{copyList[i] = list[i];}
		copyList[copyList.length - 1] = title;}
		return copyList;}
	
	/**
	 * Returns a new list with the element at index removed.
	 * @param list the original list
	 * @param index the array index to remove.
	 * @return a new list with the String at position 'index', absent.
	 */
	public static String[] discard(String[] list, int index) {
		int element = 0;
		String[] copyList = new String[list.length - 1];
		for(int i = 0; i < copyList.length; i++){
		if (list[i] == list[index])
		{copyList[i] = list[i+1];
		element = i;
		break;}
		if (list[i] != list[index])
		{copyList[i] = list[i];}}
		if ( element + 1 < copyList.length)
		{copyList[element + 1] = list[element + 2];
		element++;}
        return copyList;}
        }
