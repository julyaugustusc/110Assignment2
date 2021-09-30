/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby	
// FILENAME: Assignment2.java
// SPECIFICATION: Answering a few questions about what we've learned and putting 3 words into abc order and returning the middle word.
// FOR: CSE 110- Assignment #2
// TIME SPENT: 1.5 hours
//----------------------------------------------------------
 * 
 */
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		//Part 1
		/*Question 1
		String myString = "Coding is fun!";
		int numberOfCharacters = 0;
		numberOfCharacters = myString.length();
		System.out.println("The number of characters is:" + numberOfCharacters);
		*/
		/*Question 2
		System.out.println("Index of d in myString:" + myString.indexOf('d')); 
		*/
		/*Question 3
		System.out.println(myString.substring(10,13));
		*/
		/*Question 4
		a) True
		b) False
		c) False
		d) True
		 */
		/*Question 5
		Hr
		*/
		
		//Part 2
		Scanner scan = new Scanner(System.in);
		
		// define variables
		String str1 = "";
		String str2 = "";
		String str3 = "";
		String middleWord = "";
		
		//Use Scanner
		System.out.println("Please enter first string: ");
		str1 = scan.nextLine();
		System.out.println("Please enter second string: ");
		str2 = scan.nextLine();
		System.out.println("Please enter last string: ");
		str3 = scan.nextLine();
		
		//If and else statements
		if(str1.compareTo(str2) > 0 && str1.compareTo(str3) < 0) {
			middleWord = str1;
		} else if(str2.compareTo(str1) > 0 && str2.compareTo(str3) < 0) {
			middleWord = str2;
		} else {
			middleWord = str3;
		}
		System.out.println("The middle word is: "+middleWord);
		
	}
}
