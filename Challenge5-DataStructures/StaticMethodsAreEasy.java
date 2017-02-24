//UIUC CS125 FALL 2014 MP. File: StaticMethodsAreEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/*@author zzhu24*/

public class StaticMethodsAreEasy {
// Oh no... Someone removed  the methods but left the comments!!
// Hint: Get the Geocache class working and passing its tests first.

	/**
	 * Returns an array of num geocaches. Each geocache is initialized to a random
	 * (x,y) location.
	 * if num is less than zero, just return an empty array of length 0.
	 * 
	 * @param num
	 *            number of geocaches to create
	 * @return array of newly minted Points
	 */

	//write the method here...
	
	public static Geocache[] createGeocaches(int num){
	Geocache[] firstGeo = new Geocache[0];
	if (num < 0){
	return firstGeo;}
	firstGeo = new Geocache[num];
	for (int i = 0; i < num; i++)
	{firstGeo[i] = new Geocache(94*Math.random(), 94*Math.random());}	
	return firstGeo;}
		
	/**
	 * Modifies geocaches if the geocache's X value is less than the allowable minimum
	 * value.
	 * 
	 * @param p
	 *            array of geocaches
	 * @param minX
	 *            minimum X value.
	 * @return number of modified geocaches (i.e. x values were too small).
	 */
	
	 public static void ensureMinimumXValue(Geocache[] p, double minimumXValue){
   	 int length = p.length;
   	 for(int i = 0; i < length; i++){
   	 if(p[i].getX() < minimumXValue)
   	 p[i] = new Geocache(minimumXValue, p[i].getY());}}
	
	//write the method here...

	/**
	 * Counts the number of geocaches that are equal to the given geocache
	 * Hint: Use geocache.equals() method 
	 * @param p -
	 *            geocache array
	 * @param test -
	 *            test geocache (compared using .equal)
	 * @return number of matching geocaches
	 */
	
	 public static int countEqual(Geocache[] p, Geocache test){
   	 int length = p.length;
   	 int comparedNumber = 0;
   	 for(int i = 0; i < length; i++){
   	 if(p[i].equals(test))
   	 comparedNumber++;}
   	 return comparedNumber;}
	
	//write the method here...
}
