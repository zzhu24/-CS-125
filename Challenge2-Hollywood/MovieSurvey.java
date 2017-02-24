//UIUC CS125 FALL 2014 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T11:14:11-0600.769961893
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author zzhu24
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		// TODO: Write your program here
		// Hints :
		// Formatted output
		// http://math.hws.edu/javanotes/c2/s4.html#basics.4.4
		
		// Don't just copy paste the expected output
		// For grading purposes your code may be tested
		// with other input values.
		
		System.out.println("Welcome. We're interested in how people are watching movies this year.");
		System.out.println("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		System.out.println("Please tell us about how you've watched movies in the last month.");
		
		System.out.println("How many movies have you seen at the cinema?");
		int cinemaMovies = TextIO.getlnInt();
		
		System.out.println("How many movies have you seen using a DVD or VHS player?");
		int cinemaDvdVhsMovies = TextIO.getlnInt();
		
		System.out.println("How many movies have you seen using a Computer?");
		int computerMovies = TextIO.getlnInt();
		
		int totalNumber = cinemaMovies + cinemaDvdVhsMovies + computerMovies;
		
		System.out.println("Summary: " + cinemaMovies + " Cinema movies, " + cinemaDvdVhsMovies + " DVD/VHS movies, " + computerMovies + " Computer movies");
		System.out.println("Total: " + totalNumber + " movies");
		//* Summary: 1 Cinema movies, 101 DVD/VHS movies, 98 Computer movies
		//Total: 200 movies
		
		//Fraction of movies seen at a cinema: 0.50%
		//Fraction of movies seen outside of a cinema: 99.50%
		
		double percentageCinema = (cinemaMovies * 100.00f) / totalNumber;
        System.out.print("Fraction of movies seen at a cinema: ");
        System.out.printf( "%.2f", percentageCinema);
        System.out.println("%" );
        
		double percentageDvdVhs = (cinemaDvdVhsMovies * 100.00f) / totalNumber;		
        double percentageComputer = (computerMovies * 100.00f) / totalNumber;
        double percentageOut = percentageDvdVhs + percentageComputer;
		System.out.print("Fraction of movies seen outside of a cinema: ");
		System.out.printf( "%.2f", percentageOut);
		System.out.println("%");

	}
}
