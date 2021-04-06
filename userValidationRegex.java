import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	static String fName;


	static String firstName(){
		Scanner str1 = new Scanner(System.in);
		System.out.println("Enter your first name in ('K'eerthana) format: ");
		fName = str1.nextLine();
		return fName;
	}

	public static void main(String args[]) {

		System.out.println("Welcome to User Registration Problem!");

		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());


		while(firstName == false) {
			System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'S'anketh).");
			firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
		}


		System.out.println("First Name: " + fName);
	}
}
