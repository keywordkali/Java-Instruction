//baeldung.com/java-ternary-operator
public class TernaryOperatorApp {

	public static void main(String[] args) {
	System.out.println("Hello!");
	//Actor example -M or -F
	// if gender = "M", genderDisplay = "Male"
	// if gender = "F", genderDisplay = "Female"
	// Output: "The actors gender is Female"
	String gender = "F";
	String genderDisplay = "";
	
	//non-ternary way
	
	if (gender.equalsIgnoreCase("M")) {
		genderDisplay = "Male";
	}
	else {
		genderDisplay = "Female";
	}
	
	System.out.println("The Actor's gender is "+genderDisplay);
	////////////////////////////////////////////////////////////
	System.out.println("--------ternary operator");
	genderDisplay = "";
	
	genderDisplay = gender.equalsIgnoreCase("M") ? "Male" : "Female"; //this is a boolean. left side is = if true/ right side is = if false
	System.out.println("The Actor's gender is "+genderDisplay);
			
			
			
	
	
	
	
	System.out.println("Goodbye");

	}

}
