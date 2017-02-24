//UIUC CS125 FALL 2014 MP. File: Stack.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/* @author zzhu24*/

public class Stack {
	
	private String[] stringArray = new String[94];
	private int number;	
	
	/** Adds a value to the top of the stack.*/
	public void push(String value){
	String[] temporary = new String[number + 1];
	for (int i = 0; i < number ; i ++)
	{temporary[i] = stringArray[i];}
	number ++;
	temporary[number - 1 ] = value;
	stringArray = temporary;}
		
		
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
	if(number == 0)
	return null;
	else{
	String savedValue = stringArray[number-1];
	stringArray[number-1] = null;
	number = number -1;
	return savedValue;}}

	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() {
	if(number == 0)
	return null;
	else{
	String savedValue = stringArray[number - 1];
	return savedValue;}}

	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
	return number == 0;}

	/** Returns the number of items in the stack. */
	public int length() {
	return number;}

	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
	if(number != 0){
	String savedValue = stringArray[0] + "\n";
	for(int j = 1; j < number - 1; j++)
	savedValue += stringArray[j] + "\n";
	savedValue += stringArray[number - 1] + "\n"; 
	return savedValue;}
	else
	return "";}}