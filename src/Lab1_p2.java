/* Shontinique Uqdah
 * 07/03/2018
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Lab1_p2 {

	public static void main(String[] args) {
		
		//Creates scanner to read user input
		Scanner scnr = new Scanner(System.in);
		
		//Variable declarations
		String userDate1;
		LocalDate date1;
		String userDate2;
		LocalDate date2;
		Period timeBetween;
		
		//Prompts user for first date in a specific format
		System.out.println("Please enter the first numeric date in the format YYYY-MM-DD: ");
		userDate1 = scnr.nextLine();
		
		//Parse user input string to standard LocalDate format
		date1 = LocalDate.parse(userDate1, DateTimeFormatter.ISO_LOCAL_DATE);
		
		//Prompts user for second date in a specific format
		System.out.println("Please enter the second numeric date in the format YYYY-MM-DD: ");
		userDate2 = scnr.nextLine();
		
		//Parse user input string to standard LocalDate format
		date2 = LocalDate.parse(userDate2, DateTimeFormatter.ISO_LOCAL_DATE);
		
		//Gets the time between the two dates, in years, months, and days
		timeBetween = Period.between(date1, date2);
		
		//Prints the time between the two dates in years, months, and days
		System.out.println("There is(are) " + timeBetween.getYears() + " year(s), " + timeBetween.getMonths() + " month(s), and " + 
		timeBetween.getDays() + " day(s) between " + date1 + " and " + date2);
		
		//Closes scanner to avoid resource leaks
		scnr.close();

	}

}
