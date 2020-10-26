package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password ;
	private int passwordLength = 10;
	private String dept;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor w/ first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName ;
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
		Scanner scan = new Scanner(System.in) ;
		int deptChoice = Integer.parseInt(scan.nextLine()) ;
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
	// Generate random password
	
	// Set mailbox capacity
	
	// Set alternate email
	
	// Change password 
}
