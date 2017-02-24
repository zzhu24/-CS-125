//UIUC CS125 FALL 2014 MP. File: Queue.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/* @author zzhu24*/

public class Queue {
	
	private double[] doubleArray = new double[94];
	private int number;
	
	public void resize (int maxNumber){
	double[] temporaryArray = new double[maxNumber];
	for (int i = 0; i < number ; i++){
	temporaryArray[i] = doubleArray [i];}
	doubleArray = temporaryArray;}
	
	/** Adds the value to the front of the queue.
	 * Note the queue automatically resizes as more items are added. */
	
	public void add(double value) {
	if (number >= doubleArray.length)
	{resize (number * 2);}
	doubleArray[number++] = value;}
	
	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	
	public double remove() {
	if(number == 0)
	return 0;
	else{
	double savedValue = doubleArray[0];
	for(int j = 0; j < number - 1; j++)
	doubleArray[j] = doubleArray[j+1];
	doubleArray[number - 1] = 0.0;
	number --;
	return savedValue;}}
	
	/** Returns the number of items in the queue. */
	
	public int length() {
	return number;}
	
	/** Returns true iff the queue is empty */
	
	public boolean isEmpty() {
	return number == 0;}
	
	/** Returns a comma separated string representation of the queue. */
	
	public String toString() {
	String savedValue = doubleArray[0] + ",";
	for (int i = 1; i < number - 1 ; i++)
	{savedValue += doubleArray[i] + ",";}
	savedValue += doubleArray[number - 1];
	return savedValue;}}
