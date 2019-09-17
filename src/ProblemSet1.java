/*
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.text.NumberFormat;													// Code taken from
import java.util.Locale;														// https://javadevnotes.com/java-integer-to-string-with-commas
import java.lang.Math;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

		 final double inchToMM = 25.4;
		 final double width = 8.5;
		 final double height = 11;
		 double widthmm = width * inchToMM;
		 double heightmm = height * inchToMM;
		 double area = widthmm * heightmm;
		 NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);	// Code taken from
		 String formattedarea = numberFormat.format(area);						// https://javadevnotes.com/java-integer-to-string-with-commas
		 System.out.println("\n" + formattedarea + " square millimeters.");

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

		final double inchToCM = 2.54;
		double widthcm = width * inchToCM;
		double heightcm = height * inchToCM;
		double perimeter = (widthcm * 2) + (heightcm * 2);
		System.out.println("\n" + String.format("%.2f", perimeter) + " centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

		 double widthsquared = width * width;
		 double heightsquared = height * height;
		 double bignumber = widthsquared + heightsquared;
		 double diagonal = Math.sqrt(bignumber);
		 System.out.println("\n" + String.format("%.2f", diagonal) + " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

		 final double homeworkpercent = 0.15;
		 int homework1 = 88;
		 int homework2 = 91;
		 int homework3 = 0;
		 int homeworkavg = (homework1 + homework2 + homework3) / 3;
		 System.out.println(String.format("%.2f", homeworkavg));

		 int quiz1 = 84;
		 int quiz2 = 89;
		 int quiz3 = 93;
		 //X

		 int test1 = 74;
		 int test2 = 87;
		 int test3 = 82;
		 /*
		 note to self - multiply grade by decimal of grade %
		 homework avg: 8.95
		 quiz avg: 31.03
		 test avg: 40.5
		 */

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */



        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */



        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
