import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	static String fName;
	static String lName;
	static String email;


   static String firstName(){
      Scanner str1 = new Scanner(System.in);
      System.out.println("Enter your first name in ('K'eerthana) format");
      fName = str1.nextLine();
      return fName;
}
	static String lastName(){
      Scanner str2 = new Scanner(System.in);
      System.out.println("Enter your last name in ('J'ujjavarapu) format");
      lName = str2.nextLine();
      return lName;
   }
	static String emailId(){
		Scanner str3 = new Scanner(System.in);
		System.out.println("Enter your email ID in (abc.xyz@bl.co.in): ");
		email = str3.nextLine();
		return email;
	}

   public static void main(String args[]) {

      System.out.println("Welcome to User Registration Problem!");

      Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());

      Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());

		Boolean emailId = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}" ,UserRegistration.emailId());



      while(firstName == false) {
         System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'K'eerthana).");
         firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
      }

		while(lastName == false) {
         System.out.println("Error! Invalid input from user please enter your Last-Name in valid format(ex-'J'ujjavarapu).");
         lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());
      }

		while(emailId == false) {
         System.out.println("Error! Invalid input from user please enter your email Id in valid format(ex-'abc.xyz@bl.co.in).");
         lastName = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}",UserRegistration.emailId());
      }


      System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Email ID: " + email);
	}
}
