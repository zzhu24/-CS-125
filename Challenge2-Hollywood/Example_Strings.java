//UIUC CS125 FALL 2014 MP. File: Example_Strings.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T11:14:11-0600.769961893
public class Example_Strings {

	/**
	 * Lecture 7 example.
	 */
	public static void main(String[] args) {
		boolean keepGoing = true;
		String user;
		while (keepGoing) {
			TextIO.putln("Enter a string with exactly 5 characters.");
			user = TextIO.getln();
			TextIO.put("You typed:"); // use put not putln
			TextIO.putln(user);

			if (user.length() == 5) {
				keepGoing = false;
			} else {
				TextIO.putln("Try again!");
			}
		} // while
		TextIO.putln("Yes!");

	}

}
