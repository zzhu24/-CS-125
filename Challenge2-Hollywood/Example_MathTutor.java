//UIUC CS125 FALL 2014 MP. File: Example_MathTutor.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T11:14:11-0600.769961893
public class Example_MathTutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mathTutor();
	}

	public static void mathTutor() {
		int guess;
		
		boolean correct = false;
		// each time the beginning of the loop
		// evaluate correct == false
		// so if correct is false then we will go into the loop body again.

		while (correct == false) {
			TextIO.putln("What is 16 squared?");

			guess = TextIO.getlnInt();
			// Change the value of correct:
			// if guess is 256 then (guess == 256) will evaluate to true.
			// We will store either 'true' or 'false' inside correct:
			correct = (guess == 256);

			if (!correct) {
				TextIO.putln("Incorrect");
				TextIO.putln("Guess again!");
			}
		}
		TextIO.putln("Fabulous!");
	}

}
