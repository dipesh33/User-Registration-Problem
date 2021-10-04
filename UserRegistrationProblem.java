package RegexEx;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

		public String firstName;
		public String lastName;
		public String email;
		public String mobileNum;
		public String password;

		public boolean checkNamePattern(String name) {

			return (Pattern.matches("[A-Z]{1}[a-z]{2,}", name));

		}

		public boolean checkEmailPattern(String email) {

			return (Pattern.matches(
					"[a-zA-z0-9]+[a-zA-Z0-9-_[+]?]*[.]?[a-zA-Z0-9-_[+]?]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}", email));

		}

		public boolean checkMobileNumPattern(String email) {

			return (Pattern.matches("([0-9]{2}[ ]|0)?[6-9][0-9]{9}", email));

		}

		public boolean checkPasswordPattern(String email) {

			return (Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", email));

		}

		public boolean validation(boolean valid) {

			if (valid) {

				System.out.println("Updated");

				return true;

			}

			else {

				System.out.println("Enter valid Input");

			}

			return false;

		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			UserRegistrationProblem urp = new UserRegistrationProblem();

			System.out.println("Enter firstName: ");

			urp.firstName = sc.nextLine();

			while (!urp.validation(urp.checkNamePattern(urp.firstName)))

				urp.firstName = sc.nextLine();

			System.out.println("Enter Last Name: ");

			urp.lastName = sc.nextLine();

			while (!urp.validation(urp.checkNamePattern(urp.lastName)))

				urp.lastName = sc.nextLine();

			System.out.println("Enter Email ID: ");

			urp.email = sc.nextLine();

			while (!urp.validation(urp.checkEmailPattern(urp.email)))

				urp.email = sc.nextLine();

			System.out.println("Enter Mobile Number: ");

			urp.mobileNum = sc.nextLine();

			while (!urp.validation(urp.checkMobileNumPattern(urp.mobileNum)))

				urp.mobileNum = sc.nextLine();

			System.out.println("Enter Password: ");

			urp.password = sc.nextLine();

			while (!urp.validation(urp.checkPasswordPattern(urp.password)))

				urp.password = sc.nextLine();

			sc.close();

		}

	}