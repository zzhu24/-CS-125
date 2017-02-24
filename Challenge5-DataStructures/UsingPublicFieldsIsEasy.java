//UIUC CS125 FALL 2014 MP. File: UsingPublicFieldsIsEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2015-03-10T01:18:54-0500.421666706
/* @author zzhu24*/

/**
 * Complete the class method 'analyze' that takes a SimplePublicPair object as an argument
 * and returns a new SimplePublicTriple object.
 * The SimplePublicTriple needs to set up as follows:
 * x = the minimum value of 'a' and 'b'
 * y = the maximum value of 'a' and 'b'
 * description:a*b=M 
 *   where a,b, and M are replaced with the numerical values of a, b and the multiplication of a and b.
 * Your code will create a SimplePublicTriple, initializes the three fields and return a reference to the SimplePublicTriple object.
 *
 */
public class UsingPublicFieldsIsEasy {
    
	public void SimplePublicPair(){
	int a;
	int b;}
	
	public void SimplePublicTriple(){
	int x;
	int y;
	String description;}
	
	public static SimplePublicTriple analyze(SimplePublicPair in) {
	SimplePublicTriple resultObject = new SimplePublicTriple();
	if (in.a < in.b)
	{resultObject.x = in.a;
	resultObject.y = in.b;}
	if (in.a > in.b)
	{resultObject.x = in.b;
	resultObject.y = in.a;}
	resultObject.description = in.a + "*" + in.b + "=" + (in.a*in.b);
	return resultObject;}}