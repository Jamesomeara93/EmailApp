package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password ;
	private int passwordLength = 10;
	private String dept;
	private int mailboxCapacity = 500 ;
	private String alternateEmail;
	private Scanner scanner ;
	
	//Constructor w/ first and last name 
	public Email(String firstName, String lastName, Scanner scanner ) {
		this.firstName = firstName;
		this.lastName = lastName ;
		this.scanner = scanner ;
		String formatted = String.format("Email created: %s%s.com",this.firstName, this.lastName);
		System.out.println(formatted);
		
		// Call method asking for the dept - return the dept 
		this.dept = setDept() ;
		
		// Call method that return a random password 
		this.password = createPassword(passwordLength) ;
		
		// Combine all elements to create email
		String email = firstName.toLowerCase() + lastName.toLowerCase() + "@"+dept.toLowerCase()+".com" ;
		System.out.println(String.format("Your email is:\n%s", email));
		System.out.println(String.format("Your password is:\n%s" ,this.password));
	}
	
	// Create random password
	private String createPassword(int length) {
		this.passwordLength = length ;
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ1234567890";
		char[] password = new char[length] ;
		
		for (int i=0; i<length; i++) {
			int random = (int) (Math.random() * passwordSet.length() ) ;
			password[i] = passwordSet.charAt(random) ;
		}
		
		return new String(password) ;
	}
	
	// Ask for dept
	private String setDept() {
		System.out.println("Enter department code: \n1 for HR\n2 for Engineering\n3 for IT\n4 for none");
		int deptChoice = Integer.parseInt(this.scanner.nextLine()) ;
		switch (deptChoice) {
		case 1:
			return "HR" ;
		case 2:
			return "Engineering" ;
		case 3:
			return "IT" ;
		case 4: 
			return "" ;
		default:
			System.out.println("Invalid input, no Department added.");
			return "" ;
			
			
			
		}
	}
	
	
	// Set mailbox capacity
	public void setCapacity(int size) {
		System.out.println("Enter desired mailbox capacity: ");
		this.mailboxCapacity = Integer.parseInt(this.scanner.nextLine()) ;
	}
	// Set alternate email
	public void setAlternateEmail() {
		System.out.println("Set alternate email: ");
		this.alternateEmail = scanner.nextLine() ;
	}
	
	// Change password 
	public String changePassword() {
		System.out.println("Desired password length?");
		int length = Integer.parseInt(this.scanner.nextLine() ) ;		// could change this to be user input
		String newPassword = createPassword(length) ;
		System.out.println(String.format("New password:\n%s", newPassword));
		return newPassword ;
	}
}
