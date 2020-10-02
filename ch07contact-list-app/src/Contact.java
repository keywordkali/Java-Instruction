
public class Contact {

	private String firstName; // define instance variables
	private String lastName;
	private String email;
	private String phone;

	public Contact() { /// define empty constructor rclick>source>generate constructor using fields
		firstName = "";
		lastName = "";
		email = "";
		phone = "";

	}

	// define fully loaded constructor

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	// define getters and setters// rclick>source>generate geterrs and setters

	public String getfirstName() {
		return firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getemail() {
		return email;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public String getphone() {
		return phone;
	}

public String displayContact() {
	String str = "-------------------------------------\n";
	str += "---Current Contact----------------------------------\n";
			str += "-----------------------------------------------------------\n";
			str += "Name:\t\t"+firstName+" "+lastName+"\n";
			str += "Email:\t\t"+email+"\n";
			str += "Phone Number:\t"+phone+"\n";
			str += "----------------------------------------------------\n";
			
			
			
	
	
	
	return str;
}

}
