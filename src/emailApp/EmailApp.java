
package emailApp;
import java.util.Scanner ;

public class EmailApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;		// this should be passed in to the constructor for use in the other class
		System.out.println("Enter first name:");
		String fName = scanner.nextLine() ;
		System.out.println("Enter last name:");
		String lName = scanner.nextLine() ;
		
		Email email = new Email(fName , lName) ;
	}

}
