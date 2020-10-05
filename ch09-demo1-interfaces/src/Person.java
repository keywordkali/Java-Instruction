public class Person {
	protected  String firstName;
	protected  String lastName;

	public Person() {
		firstName = "";
		lastName = "";

	}

	public void setpersonFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName;
	}

}