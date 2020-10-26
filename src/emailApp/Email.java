package emailApp;

public class Email {
	private String firstName;
	private String lastName;
	private String password ;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor w/ first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName ;
		String formatted = String.format("Email created: %s%s.com",this.firstName, this.lastName);
		System.out.println(formatted);
	}
	
	// Ask for dept
	
	// Generate random password
	
	// Set mailbox capacity
	
	// Set alternate email
	
	// Change password 
}
