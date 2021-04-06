  
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	static String fName;
	static String lName;
	static String email;
	static String pNum;
	static String password;


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
		System.out.println("Enter your email ID in (abc.xyz@bl.co.in) 'abc.' is compulsory xyz can be any three letters '@bl.co' is compulsory and 'in' can be any letters : ");
		email = str3.nextLine();
		return email;
	}


	static String phoneNum(){
      Scanner str4 = new Scanner(System.in);
      System.out.println("Enter your phone number in (ex- '91 9999999999'): ");
      pNum = str4.nextLine();
      return pNum;
   }

	static String passwordCheck(){
      Scanner str5 = new Scanner(System.in);
      System.out.println("Enter your password of atleast 8 characters and atleast one upper case letter): ");
      password = str5.nextLine();
      return password;
   }
	static void allEmailChecks(String a){
		Boolean emailCheck = Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$",a);
		System.out.println(emailCheck);
	}

   public static void main(String args[]) {
          System.out.println("Welcome to User Registration Problem!");


      Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());

      Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());


     Boolean emailId = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}" ,UserRegistration.emailId());


      Boolean phoneNum = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}" ,UserRegistration.phoneNum());


      Boolean passwordCheck = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}" ,UserRegistration.passwordCheck());


      while(firstName == false) {
         System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'K'eerthana).");
         firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
      }

		while(lastName == false) {
         System.out.println("Error! Invalid input from user please enter your Last-Name in valid format(ex-'J'ujjavarapu).");
         lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());
      }

		while(emailId == false) {
         System.out.println("Error! Invalid input from user please enter your email Id in valid format(ex-'abc.xyz@bl.co.in) 'abc.' is compulsory xyz can be any three letters '@bl.co' is compulsory and 'in' can be any letters .");
         emailId = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}",UserRegistration.emailId());
      }
		
		while(phoneNum == false) {
			System.out.println("Error! Invalid input from user please enter your phone number in valid format(ex-'91 9999999999').");
			phoneNum = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}" ,UserRegistration.phoneNum());
		}

		while(passwordCheck == false) {
         System.out.println("Error! Invalid input from user please enter your password in valid format(should contain atleast 8 characters and atleast one upper case letter).");
     		passwordCheck = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}" ,UserRegistration.passwordCheck());
		}


		System.out.println("-----------------------------");
      System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Email ID: " + email);
		System.out.println("Phone number: +" + pNum);
		System.out.println("Password: " + password);
		System.out.println("-----------------------------");


	allEmailChecks("abc@yahoo.com");
	allEmailChecks("abc-100@yahoo.com");
	allEmailChecks("abc.100@yahoo.com");
	allEmailChecks("abc111@abc.com");
	allEmailChecks("abc-100@abc.net");
	allEmailChecks("abc.100@abc.com.au");
	allEmailChecks("abc@1.com");
	allEmailChecks("abc@gmail.com.com");
	allEmailChecks("abc+100@gmail.com");


	allEmailChecks("abc");
	allEmailChecks("abc@.com.my");
	allEmailChecks("abc123@gmail.a");
	allEmailChecks("abc123@.com");
	allEmailChecks("abc123@.com.com");
	allEmailChecks(".abc@abc.com");
	allEmailChecks("abc()*@gmail.com");
	allEmailChecks("abc@%*.com");
	allEmailChecks("abc..2002@gmail.com");
	allEmailChecks("abc.@gmail.com");
	allEmailChecks("abc@abc@gmail.com");
	allEmailChecks("abc@gmail.com.1a");	
	allEmailChecks("abc@gmail.com.aa.au");
	}
}
