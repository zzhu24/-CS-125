//UIUC CS125 FALL 2014 MP. File: BlackBeltDebuggerChallenge.java, CS125 Project: Challenge6-RecursionSee, Version: 2015-03-30T09:35:13-0500.461573126
/**
 * This class tests your Debugger Fu. Use Debug As > Unit Test on the Test
 * class. You'll need to set breakpoints and single step through the code.
 * @author zzhu24
 */

public class BlackBeltDebuggerChallenge {

	/**
	 * Use the Debugger's breakpoints, and the debugger controls to discover the
	 * character you need here to make the test pass.
	 * 
	 * @return the secret character
	 */
	public static char getTrial0Secret() {
	// Warning - the value you need here is specific to you
	String netId = "zzhu24";
	netId = netId.trim().toUpperCase();
	if (netId.length() == 0 || netId.length() > 10)
	throw new RuntimeException("Invalid NetID");
	int result = 0xBAADF00D;
	for (int i = 0; i < netId.length(); i++) {
	char c = netId.charAt(i);
	boolean ok = Character.isDigit(c) || (c >= 'A' && c <= 'Z')
	|| c == '-';
	if (!ok)
	throw new RuntimeException("Invalid NetID:" + c);
	result = (int) (2654435761L * result) ^ c;} // Knuth's simple hash
	int unique = result;
	char required = 'a';
	required += 1 + (unique & 7);
	return required;}

	/**
	 * Use the Debugger's breakpoints, and the debugger controls to discover the
	 * character you need here to make the test pass.
	 * 
	 * @return the secret character
	 */
	public static char getTrial1Secret() {
	// Warning - the value you need here is specific to you
	String netId = "zzhu24";
	netId = netId.trim().toUpperCase();
	if (netId.length() == 0 || netId.length() > 10)
	throw new RuntimeException("Invalid NetID");
	int result = 0xBAADF00D;
	for (int i = 0; i < netId.length(); i++) {
	char c = netId.charAt(i);
	boolean ok = Character.isDigit(c) || (c >= 'A' && c <= 'Z')
	|| c == '-';
	if (!ok)
	throw new RuntimeException("Invalid NetID:" + c);
	result = (int) (2654435761L * result) ^ c;} // Knuth's simple hash
	int unique = result;
	int offset = (unique >> 2 & 7);
	int f = 'z'-offset-1;
	return (char)f;}

	/**
	 * Use the Debugger's breakpoints, and the debugger controls to discover the
	 * character you need here to make the test pass.
	 * 
	 * @return the secret character
	 */
	public static char getTrial2Secret() {
	// Warning - the value you need here is specific to you
	String netId = "zzhu24";
	netId = netId.trim().toUpperCase();
	if (netId.length() == 0 || netId.length() > 10)
	throw new RuntimeException("Invalid NetID");
	int result = 0xBAADF00D;
	for (int i = 0; i < netId.length(); i++) {
	char c = netId.charAt(i);
	boolean ok = Character.isDigit(c) || (c >= 'A' && c <= 'Z')
	|| c == '-';
	if (!ok)
	throw new RuntimeException("Invalid NetID:" + c);
	result = (int) (2654435761L * result) ^ c;} // Knuth's simple hash
	int unique = result;
	int levels = 2 + ((unique >> 2) & 7);
	return (char)((levels*2)+'A');}

	/**
	 * Use the Debugger's breakpoints, and the debugger controls to discover the
	 * character you need here to make the test pass.
	 * 
	 * @return the secret character
	 */
	public static char getTrial3Secret() {
	String netId = "zzhu24";
	netId = netId.trim().toUpperCase();
	if (netId.length() == 0 || netId.length() > 10)
	throw new RuntimeException("Invalid NetID");
	int result = 0xBAADF00D;
	for (int i = 0; i < netId.length(); i++) {
	char c = netId.charAt(i);
	boolean ok = Character.isDigit(c) || (c >= 'A' && c <= 'Z')
	|| c == '-';
	if (!ok)
	throw new RuntimeException("Invalid NetID:" + c);
	result = (int) (2654435761L * result) ^ c;} // Knuth's simple hash
	int unique = result;
	return 9;}}
