package class20;
import java.util.Scanner;
public class task {
	
	/*  
	 * 1.
         * Create a method createEmail().
         * Based on provided users name, lastName and email type,
         * your method should return complete email Address;
         * johnsnow@gmail.com
         * johnsnow@yahoo.com
	 */




		static String createEmail(String A, String B) {
			return A + B;
		}
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Please input last name");
			String lastName = scan.nextLine();
			System.out.println("Please input email type");
			String emailType = scan.nextLine();
			System.out.println(createEmail(lastName,emailType));
		}
	}

